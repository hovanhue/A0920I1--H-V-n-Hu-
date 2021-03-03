USE classicmodels;
select productCode, productName, buyprice, quantityInstock from products
where buyprice > 56.76 and quantityInstock >10;


SELECT productCode, productName, buyprice, textDescription
FROM products
inner join productlines
on products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast'