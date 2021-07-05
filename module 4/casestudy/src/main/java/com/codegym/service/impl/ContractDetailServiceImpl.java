package com.codegym.service.impl;

import com.codegym.model.ContractDetails;
import com.codegym.repository.ContractDetailsRepository;
import com.codegym.repository.ContractRepository;
import com.codegym.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {

    @Autowired
    private ContractDetailsRepository contractDetailsRepository;

    @Override
    public ContractDetails findContractDetailsById(int id) {
        return contractDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ContractDetails contractDetails) {
        contractDetailsRepository.save(contractDetails);
    }
}
