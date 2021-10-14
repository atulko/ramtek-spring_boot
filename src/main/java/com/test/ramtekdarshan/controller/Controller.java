package com.test.ramtekdarshan.controller;

import com.test.ramtekdarshan.entity.User;
import com.test.ramtekdarshan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @GetMapping("/getuser")
    public List<User> findAllUser()
    {
        final List<User> allUser = userService.getAllUser();
        return allUser;
    }
}
