package com.codegym.service.impl;

import com.codegym.model.Status;
import com.codegym.repository.StatusRepository;
import com.codegym.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;


    @Override
    public void createStatus() {
        statusRepository.save(new Status(1, "available"));
        statusRepository.save(new Status(2, "used"));
    }
}
