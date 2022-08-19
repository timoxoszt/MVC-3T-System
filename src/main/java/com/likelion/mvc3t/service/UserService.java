package com.likelion.mvc3t.service;

import com.likelion.mvc3t.model.User;

public interface UserService {
        void listUsers();
        User showUser(String id);
}
