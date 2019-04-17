package com.fybdp.jpademo.controller;

import com.fybdp.jpademo.model.Address;
import com.fybdp.jpademo.repository.AddressRepository;
import com.fybdp.jpademo.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressRepository addressRepository;
    private AddressService addressService;

    @Autowired
    public AddressController(AddressRepository addressRepository, AddressService addressService) {
        this.addressRepository = addressRepository;
        this.addressService = addressService;
    }

    @GetMapping()
    public List<Address> getAddressList() {
        return addressRepository.findAll();
    }


}
