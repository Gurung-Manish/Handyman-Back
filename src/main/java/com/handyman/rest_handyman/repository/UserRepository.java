package com.handyman.rest_handyman.repository;

import com.handyman.rest_handyman.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    //customer methods....
}
