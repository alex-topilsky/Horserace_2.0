package com.epam.horserace.dao;

import com.epam.horserace.tables.AbstractTable;

import java.util.HashMap;
import java.util.Map;

public final class Arguments {
    private final Map<String, Object> parameters;

    public Arguments() {
        parameters = new HashMap<String, Object>();
    }

    public Arguments(final AbstractTable column, final Object value) {
        this();
        add(column, value);
    }

    public final void add(final AbstractTable column, final Object value) {
        parameters.put(column.toString(), value);
    }

    public final Map<String, Object> getParameters() {
        return parameters;
    }
}