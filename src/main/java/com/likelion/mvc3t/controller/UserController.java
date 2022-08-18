package com.likelion.mvc3t.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("users")
    public String UsersMethod()
    {
        return "list users";
    }
    @GetMapping("user/{id}")
    public String UserID(@PathVariable("id") String id)
    {
        return "id:"+id;
    }
}
