package com.example.demo1.service.Impl;

import com.example.demo1.model.User;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public String selectUser(){

       // List<User> users = userRepository.getUserNodeList();
      //Integer users = userRepository.getUserNodecount();

        //Iterable<User> users1 = userRepository.findAll();
        //for (User user:users){
          //  System.out.println(user.getId());
        //}
        //Iterable<User> a = userRepository.findAll();

        Iterable<User> a = userRepository.getUserId();
        System.out.println(userRepository.getUserCount());
        String b = null;
        for (User user:a){
            System.out.println(user.getId());
            if(b=="" || b==null){b=user.getId();}
            else{b = b+","+user.getId();}
        }
        return b;
    }

}
