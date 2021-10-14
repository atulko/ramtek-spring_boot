package com.test.ramtekdarshan.service;

import com.test.ramtekdarshan.entity.User;
import com.test.ramtekdarshan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id)
    {
        return userRepository.findById(id);
    }


}
