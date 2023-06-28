package com.handyman.rest_handyman.impl;

import com.handyman.rest_handyman.model.User;
import com.handyman.rest_handyman.repository.UserRepository;
import com.handyman.rest_handyman.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        //extra business logics here
        userRepository.save(user);
        return "Success to save user";
    }

    @Override
    public String updateUser(User user) {
        //extra business logics here
        userRepository.save(user);
        return "Success to update user";
    }

    @Override
    public String deleteUser(String userId) {
        //extra business logics here
        //sensitive operation
        userRepository.deleteById(userId);
        return "Success to delete user";
    }

    @Override
    public User getUser(String userId) {
        //extra business logics here
        return userRepository.findById(userId).get();
    }

    @Override
    public List<User> getAllUsers() {
        //extra business logics here
        return userRepository.findAll();
    }
}
