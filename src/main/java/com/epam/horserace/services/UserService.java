package com.epam.horserace.services;


import com.epam.horserace.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserDao userDao;

    public final String getUser(String name){
        return userDao.getUser(name);
    }
}
