package com.handyman.rest_handyman.controller;

import com.handyman.rest_handyman.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserAPIService {
    User user;
    @GetMapping("{userId}")
    public User getUserDetails(String userId){
        return new User("u1","mg","mg","mg@gmail.com","98765","9 Road","","DA8 1PL","London","customer");
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        this.user = user;
        return "User Created Successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        this.user = user;
        return "User Updated Successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(String userId){
        this.user = null;
        return "User Deleted Successfully";
    }
}
