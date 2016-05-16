package com.epam.horserace.dao;


import com.epam.horserace.entities.AbstractEntity;
import com.epam.horserace.mappers.AbstractMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.sql.ResultSet;
import java.util.List;

public abstract class AbstractDao<E extends AbstractEntity> extends NamedParameterJdbcDaoSupport {
    private final AbstractMapper<E> mapper;

    public AbstractDao(AbstractMapper<E> mapper) {
        this.mapper = mapper;
    }

    protected final Integer update(final String query, final Arguments argument) {
        return getNamedParameterJdbcTemplate().update(query, argument.getParameters());
    }

    protected final List<E> search(final String query, final Arguments arguments) {
        if (arguments == null)
            return null;
        return getNamedParameterJdbcTemplate().query(query, arguments.getParameters(), mapper);
    }
}