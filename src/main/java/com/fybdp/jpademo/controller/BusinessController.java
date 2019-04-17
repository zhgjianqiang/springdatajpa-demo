package com.fybdp.jpademo.controller;

import com.fybdp.jpademo.model.Business;
import com.fybdp.jpademo.repository.BusinessRepository;
import com.fybdp.jpademo.service.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/businesses")
public class BusinessController {

    private BusinessRepository businessRepository;
    private BusinessService businessService;

    @Autowired
    public BusinessController(BusinessRepository businessRepository, BusinessService businessService) {
        this.businessRepository = businessRepository;
        this.businessService = businessService;
    }

    @GetMapping()
    public List<Business> getBusinessList() {
        return businessRepository.findAll();
    }
}
