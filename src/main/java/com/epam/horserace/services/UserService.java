package com.epam.horserace.services;


import com.epam.horserace.dao.UserDao;
import com.epam.horserace.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserDao userDao;

    public final List<UserEntity> getUser(Long id){
        return userDao.getUser(id);
    }
}
