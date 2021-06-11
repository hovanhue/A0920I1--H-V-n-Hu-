package com.example.service.impl;

import com.example.model.Cart;
import com.example.model.Product;
import com.example.repository.CartRepository;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CartRepository cartRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public boolean giveProductBack(Cart cart) {
        Product product;
        cart = cartRepository.findById(cart.getId()).orElse(null);
        if(cart == null){
            return false;
        }
        else {
            product = productRepository.findById(cart.getProduct().getIdProduct()).orElse(null);
            assert product != null;
            increaseAmount(product);
        }
        productRepository.save(product);
        cartRepository.delete(cart);
        return true;
    }

    @Override
    public void decreaseAmount(Product product) throws Exception {
        int sl = 0;
        if(product.getQuantityProduct() < 1){
            throw new Exception();
        }
        else{
            int amount = (int) product.getPriceProduct();
            product.setPriceProduct(amount);
            sl = product.getQuantityProduct()+1;
            product.setQuantityProduct(sl);
        }
        productRepository.save(product);
    }

    @Override
    public void increaseAmount(Product product) {
        int amount = product.getQuantityProduct()+1;
        product.setQuantityProduct(amount);
        int remainAmount = product.getQuantityProduct()-1;
        product.setQuantityProduct(remainAmount);

        productRepository.save(product);
    }

    @Override
    public double totalPrice(Cart cart) {
        double total = 0;
        for(int i=0;i<cart.getQuantity();i++){
            total+= cart.getQuantity()*cart.getProduct().getPriceProduct();
        }
        return total;
    }
}
