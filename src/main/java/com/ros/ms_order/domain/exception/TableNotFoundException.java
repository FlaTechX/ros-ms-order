package com.ros.ms_order.domain.exception;

public class TableNotFoundException extends RuntimeException {
    public TableNotFoundException() {
        super("Table not found");
    }
}
