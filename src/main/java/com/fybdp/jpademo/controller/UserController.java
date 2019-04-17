package com.fybdp.jpademo.controller;

import com.fybdp.jpademo.model.Business;
import com.fybdp.jpademo.model.User;
import com.fybdp.jpademo.repository.UserRepository;
import com.fybdp.jpademo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private UserService userService;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
