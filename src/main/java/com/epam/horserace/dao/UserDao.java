package com.epam.horserace.dao;

import com.epam.horserace.entities.UserEntity;
import com.epam.horserace.mappers.UserMapper;
import com.epam.horserace.tables.UserTable;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class UserDao extends AbstractDao{
    private String queryGetByID;

    public UserDao() {
        super(new UserMapper());
    }

    public List<UserEntity> getUser(int id){
        return search(queryGetByID, new Arguments(UserTable.USER_ID, id));
    }

    @Required
    public void setGetUserByID(String queryGetByID) {
        this.queryGetByID=queryGetByID;
    }
}
