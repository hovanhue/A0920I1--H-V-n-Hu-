package com.codegym.service;

import com.codegym.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService {
    List<Service> findAll();
    Page<Service> findAllService(Pageable pageable);
    Service findServiceById(int id);
    void saveService(Service service);
    void deleteServiceById(int id);

    Page<Service> findServiceByNameContaining(String key, Pageable pageable);

}
