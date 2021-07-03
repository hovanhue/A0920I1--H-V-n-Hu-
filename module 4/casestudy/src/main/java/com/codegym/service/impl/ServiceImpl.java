package com.codegym.service.impl;

import com.codegym.repository.ServiceRepository;
import com.codegym.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<com.codegym.model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Page<com.codegym.model.Service> findAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public com.codegym.model.Service findServiceById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void saveService(com.codegym.model.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteServiceById(int id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Page<com.codegym.model.Service> findServiceByNameContaining(String key, Pageable pageable) {
        return serviceRepository.findServiceByService_name(key, pageable);
    }
}
