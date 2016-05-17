package com.epam.horserace.dao;

import com.epam.horserace.entities.UserEntity;
import com.epam.horserace.mappers.UserMapper;
import com.epam.horserace.tables.UserTable;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class UserDao extends AbstractDao{
    private String queryGetByID;
    private String queryCreateUser;
    private String queryGetByName;

    public UserDao() {
        super(new UserMapper());
    }

    public List<UserEntity> getUserByID(Long id){
        return search(queryGetByID, new Arguments(UserTable.USER_ID, id));
    }

    public List<UserEntity> getUserByName(String name){
        return search(queryGetByName, new Arguments(UserTable.USER_NAME, name));
    }

    public long create(String name, String surname, String password, String email){
        Arguments arguments = new Arguments(UserTable.USER_NAME, name);
        arguments.add(UserTable.USER_SURNAME, surname);
        arguments.add(UserTable.USER_PASSWORD, password);
        arguments.add(UserTable.USER_EMAIL, email);
        return insert(queryGetByName, arguments);
    }

    @Required
    public void setQueryGetByID(String queryGetByID) {
        this.queryGetByID = queryGetByID;
    }

    @Required
    public void setQueryCreateUser(String queryCreateUser) {
        this.queryCreateUser = queryCreateUser;
    }

    @Required
    public void setQueryGetByName(String queryGetByName) {
        this.queryGetByName = queryGetByName;
    }
}
