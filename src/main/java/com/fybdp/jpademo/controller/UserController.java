package com.fybdp.jpademo.controller;

import com.fybdp.jpademo.model.Business;
import com.fybdp.jpademo.model.User;
import com.fybdp.jpademo.repository.UserRepository;
import com.fybdp.jpademo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/page")
    public Page<User> getPageUserList(@PageableDefault Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @GetMapping("/unable")
    public List<User> getUnableUser() {
        return userRepository.findByStatusIsFalse();
    }

    @GetMapping("/name-like")
    public List<User> getNameLikeUser(@RequestParam String nameLike) {
        return userRepository.findByNameLike(nameLike);
    }

    @GetMapping("/address-info")
    public List<User> getUserByAddressInfo(@RequestParam String info) {
        return userRepository.findByAddressInfoIs(info);
    }

    @PostMapping("")
    public User addUser(@RequestBody User addUser) {
        return userService.addUser(addUser);
    }

    @PutMapping("")
    public User updateUser(@RequestBody User updateUser) {
        return userService.updateUser(updateUser);
    }

    @DeleteMapping("")
    public boolean deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @GetMapping("/query")
    public List<Map<String, Object>> getQuery() {
        return userService.getQuery();
    }
}
