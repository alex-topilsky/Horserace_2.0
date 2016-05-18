package com.epam.horserace.controllers;

import com.epam.horserace.entities.UserEntity;
import com.epam.horserace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserByID", method = RequestMethod.GET)
    public final ModelAndView getUserByID(@RequestParam("id") Long id) {
        ModelAndView mv = new ModelAndView("../index.jsp");
        for (UserEntity user : userService.getUserByID(id)) {
            mv.addObject("user", user.name);
        }
        return mv;
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public final ModelAndView getUserByName(@RequestParam("name") String name) {
        ModelAndView mv = new ModelAndView("/index.jsp");
        for (UserEntity user : userService.getUserByName(name)) {
            mv.addObject("user", user.surname);
        }
        return mv;
    }

    @RequestMapping(value = "/create")
    public final long createUser(@RequestParam("name") String name,
                                 @RequestParam("surname") String surname,
                                 @RequestParam("password") String password,
                                 @RequestParam("email") String email) {
        return userService.create(name, surname, password, email);
    }
}
