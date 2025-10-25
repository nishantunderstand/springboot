package com.spring.boot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.dao.UserDao;
import com.spring.boot.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    // Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userDao.save(user); // userId will be auto-generated
    }
    
    @PostMapping("/batch")
    public ResponseEntity<List<User>> createUsers(@RequestBody List<User> users) {
        List<User> savedUsers = userDao.saveAll(users);
        return ResponseEntity.ok(savedUsers);
    }


    // Get a single user by ID
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userDao.get(userId); // using Long for consistency
    }

    // Get all users
    @GetMapping
    public Map<Object, Object> getAllUsers() {
        return userDao.findAll();
    }

    // Delete a user by ID
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userDao.delete(userId);
    }
    
    
}
