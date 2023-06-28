package com.handyman.rest_handyman.controller;

import com.handyman.rest_handyman.model.User;
import com.handyman.rest_handyman.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //Read Specific User Details
    @GetMapping("{userId}")
    public User getUserDetails(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    //Read All Users
    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        return "User Created Successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "User Updated Successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "User Deleted Successfully";
    }
}
