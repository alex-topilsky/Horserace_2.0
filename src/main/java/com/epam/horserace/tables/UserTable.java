package com.epam.horserace.tables;


public enum UserTable implements AbstractTable {
    USER_ID("id_user"),
    USER_NAME("name"),
    USER_SURNAME("surname"),
    USER_PASSWORD("password"),
    USER_EMAIL("email"),
    USER_BALANCE("balance"),
    USER_ROLE("role");

    private final String columnName;

    UserTable(final String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }
}
