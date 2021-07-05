package com.codegym.service;

import com.codegym.model.ContractDetails;

import java.util.List;

public interface ContractDetailService {
    ContractDetails findContractDetailsById(int id);
    void save(ContractDetails contractDetails);
}
