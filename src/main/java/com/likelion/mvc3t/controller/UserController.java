package com.likelion.mvc3t.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.likelion.mvc3t.service.UserService;
import com.likelion.mvc3t.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import com.likelion.mvc3t.model.User;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    private UserService userService;
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("users", userRepository.listUsers());
        return "index";
    }
    @GetMapping(value = { "/{id}" })
    @ResponseBody
    public User returnJson(@PathVariable String id){
        return userService.showUser(id);
    }
}
