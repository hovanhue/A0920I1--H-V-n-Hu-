package com.codegym.repository;

import com.codegym.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

    @Query("select u from Service u where u.service_name =?1")
    Page<Service> findServiceByService_name(String key, Pageable pageable);
}
