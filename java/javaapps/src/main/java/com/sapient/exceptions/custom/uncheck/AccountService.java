package com.sapient.exceptions.custom.uncheck;

public class AccountService {
    private double balance = 1000.00;

    public double witdraw(double amt) {
        if (balance < amt) {
            //error : you are throwing where this method is called.
            throw new BalanceNotFoundException("Balance Not Found " + "balace=>" + balance + "amt to be withdrawn =>" + amt);
        }
        return balance - amt; //balance
    }
}
