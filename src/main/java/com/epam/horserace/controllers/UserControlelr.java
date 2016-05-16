package com.epam.horserace.controllers;

import com.epam.horserace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserControlelr {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public final String getUser(@RequestParam("name") String name) {
        return userService.getUser(name);
    }

}
