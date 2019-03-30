package com.example.demo1.controller;

import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/id")
    public String selectUser(HttpServletRequest request, HttpServletResponse response){
       // neo4j
        String users = userService.selectUser();
        System.out.println(users);
        return users;
    }


}
