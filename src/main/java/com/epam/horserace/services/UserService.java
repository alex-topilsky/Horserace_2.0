package com.epam.horserace.services;


import com.epam.horserace.dao.UserDao;
import com.epam.horserace.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public final List<UserEntity> getUserByID(Long id){
        return userDao.getUserByID(id);
    }

    public final List<UserEntity> getUserByName(String name){
        return userDao.getUserByName(name);
    }

    public final long create(String name, String surname, String password, String email){
        return userDao.create(name, surname, password, email);
    }
}
