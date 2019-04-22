package com.example.demo.com.example.controller;

import com.example.demo.com.example.model.User;
import com.example.demo.com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/addOne")
    public @ResponseBody User addOneUser(@RequestBody User user)
    {
        User saveUser = userService.saveUser(user);
        return user;
    }

    @GetMapping("/queryAll")
    public @ResponseBody List<User> findAllUser()
    {
        return userService.findAll();
    }

    @GetMapping("/queryName")
    public @ResponseBody String findByName(@RequestParam String name)
    {
        return userService.verifyUser(name);
    }
}
