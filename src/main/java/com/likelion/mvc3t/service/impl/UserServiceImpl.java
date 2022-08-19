package com.likelion.mvc3t.service.impl;

import com.likelion.mvc3t.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.likelion.mvc3t.service.UserService;
import com.likelion.mvc3t.repository.UserRepository;

import java.util.ArrayList;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserService userService;
    @Override
    public void listUsers() {
    }

    @Override
    public User showUser(String id) {
        return null;
    }
}