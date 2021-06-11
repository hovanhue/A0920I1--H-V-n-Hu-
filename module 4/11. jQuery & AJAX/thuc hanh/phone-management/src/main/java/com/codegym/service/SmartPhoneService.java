package com.codegym.service;

import com.codegym.model.SmartPhone;

public interface SmartPhoneService {
    Iterable<SmartPhone> findAll();
    SmartPhone findById(Integer id);
    SmartPhone save(SmartPhone phone);
    SmartPhone remove(Integer id);
}
