package com.epam.horserace.mappers;


import com.epam.horserace.entities.UserEntity;
import com.epam.horserace.tables.UserTable;

import java.sql.SQLException;

public class UserMapper extends AbstractMapper<UserEntity> {

    @Override
    public UserEntity map(Row row) throws SQLException {
        final UserEntity userEntity = new UserEntity();
        userEntity.id = row.getLong(UserTable.USER_ID);
        userEntity.eMail = row.getString(UserTable.USER_EMAIL);
        userEntity.name = row.getString(UserTable.USER_NAME);
        userEntity.surname = row.getString(UserTable.USER_SURNAME);
        userEntity.role = row.getString(UserTable.USER_ROLE);
        userEntity.balance = row.getDouble(UserTable.USER_BALANCE);
        userEntity.password = row.getString(UserTable.USER_PASSWORD);

        return userEntity;
    }
}
