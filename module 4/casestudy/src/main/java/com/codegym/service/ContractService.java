package com.codegym.service;

import com.codegym.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ContractService {

    Page<Contract> findAll(Pageable pageable);
    Contract findById(int id);
    void save(Contract contract);
    void deleteById(int id);

    Page<Contract> findContractByNameCustomer(String name, Pageable pageable);

}
