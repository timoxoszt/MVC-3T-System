package com.likelion.mvc3t.service.impl;

import com.likelion.mvc3t.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.likelion.mvc3t.service.UserService;
import com.likelion.mvc3t.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collections;

@Service
@Component
public class UserServiceImpl implements UserService {
    ArrayList<User> users = new ArrayList<User>();
    @Autowired
//    private UserService userService;
    private UserRepository userRepository;
    @Override
    public void listUsers() {
        ArrayList<User> users = (ArrayList<User>) userRepository.listUsers();
        Collections.sort(users, Collections.reverseOrder());
    }

    @Override
    public User showUser(String id) {
        return userRepository.showUser(id);
    }
}