package org.example.paymybuddy.service;

import org.example.paymybuddy.model.User;
import org.example.paymybuddy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User new_user) {
        // if user already exists -> error
        // else
        // check coordonners ok
        return userRepository.save(new_user);
    }
}
