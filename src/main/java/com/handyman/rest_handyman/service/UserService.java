package com.handyman.rest_handyman.service;

import com.handyman.rest_handyman.model.User;

import java.util.List;

public interface UserService {
    //all methods to be implemented for business layer

    public String createUser(User user);
    public String updateUser(User user);
    public String deleteUser(String userId);
    public User getUser(String userId);
    public List<User> getAllUsers();
}
