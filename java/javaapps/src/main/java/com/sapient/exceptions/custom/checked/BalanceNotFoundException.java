package com.sapient.exceptions.custom.checked;

public class BalanceNotFoundException extends Exception {
    public BalanceNotFoundException() {
        super(); // calling super class constructor
    }
    public BalanceNotFoundException(String errorMessage) {
        super(errorMessage); // calling super class constructor
    }
}

