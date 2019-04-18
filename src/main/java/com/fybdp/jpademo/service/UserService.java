package com.fybdp.jpademo.service;

import com.fybdp.jpademo.model.User;
import com.fybdp.jpademo.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        if (user.getId() != null) {
            throw new RuntimeException("id应为空");
        }
        return userRepository.save(user);
    }

    public User updateUser(User updateUser) {
        if (updateUser.getId() == null) {
            throw new RuntimeException("id不能为空");
        }
        return userRepository.save(updateUser);
    }

    public boolean deleteUser(User user) {
        userRepository.delete(user);
        return true;
    }

    public List<Map<String, Object>> getQuery() {
        return userRepository.getQuery();
    }
}
