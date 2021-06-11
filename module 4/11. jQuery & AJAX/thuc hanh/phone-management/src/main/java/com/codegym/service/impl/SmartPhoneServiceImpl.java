package com.codegym.service.impl;

import com.codegym.model.SmartPhone;
import com.codegym.repository.SmartPhoneRepository;
import com.codegym.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartPhoneServiceImpl implements SmartPhoneService {
    @Autowired
    private SmartPhoneRepository smartPhoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public SmartPhone findById(Integer id) {
        return smartPhoneRepository.findById(id).orElse(null);
    }

    @Override
    public SmartPhone save(SmartPhone phone) {
        return smartPhoneRepository.save(phone);
    }

    @Override
    public SmartPhone remove(Integer id) {
        SmartPhone smartPhone = smartPhoneRepository.findById(id).orElse(null);
        smartPhoneRepository.deleteById(id);
        return smartPhone;
    }
}
