package com.epam.horserace.controllers;

import com.epam.horserace.entities.UserEntity;
import com.epam.horserace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public final List<UserEntity> getUserByID(@RequestParam("id") Long id) {
        return userService.getUser(id);
    }
}
