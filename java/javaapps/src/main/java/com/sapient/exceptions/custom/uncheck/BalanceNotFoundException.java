package com.sapient.exceptions.custom.uncheck;

public class BalanceNotFoundException extends RuntimeException {
    public BalanceNotFoundException() {
        super(); // calling super class constructor
    }
    public BalanceNotFoundException(String errorMessage) {
        super(errorMessage); // calling super class constructor
    }
}
