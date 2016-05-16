package com.epam.horserace.mappers;


import com.epam.horserace.entities.AbstractEntity;
import com.epam.horserace.tables.AbstractTable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.*;

public abstract class AbstractMapper<E extends AbstractEntity> implements RowMapper<E> {
    public final class Row {
        private final ResultSet result;

        public Row(final ResultSet result) {
            this.result = result;
        }

        public final String getString(final AbstractTable column) throws SQLException {
            return result.getString(column.getColumnName());
        }

        public final Long getLong(final AbstractTable column) throws SQLException {
            return result.getLong(column.getColumnName());
        }

        public final double getDouble(final AbstractTable column) throws SQLException {
            return result.getDouble(column.getColumnName());
        }

    }

    @Override
    public final E mapRow(final ResultSet resultSet, final int i) throws SQLException {
        return map(new Row(resultSet));
    }

    public abstract E map(final Row row) throws SQLException;

}