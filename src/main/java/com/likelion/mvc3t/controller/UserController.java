package com.likelion.MVC3T.controller;

import java.util.ArrayList;
import java.util.List;

import com.likelion.MVC3T.service.UserService;
import com.likelion.MVC3T.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private static List<UserRepository> users = new ArrayList<UserRepository>();

    static {
        users.add(new UserRepository("1", "Minh Tien", "20", "Java"));
        users.add(new UserRepository("2", "Tien Minh", "21", "PHP"));
        users.add(new UserRepository("3", "Vi Minh", "22", "Python"));
        users.add(new UserRepository("4", "Tien Vi", "23", "Golang"));
        users.add(new UserRepository("5", "Vi Tien", "24", "ASM"));
    }

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = { "/users" }, method = RequestMethod.GET)
    public String personList(Model model) {

        model.addAttribute("users", users);

        return "users";
    }
}
