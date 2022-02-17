package com.sapient.exceptions.custom.uncheck;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        double response = 0.0;
        response = accountService.witdraw(100);
        System.out.println("Response is " + response);
        //without try catch code will be compiled...
//        response = accountService.witdraw(3000);
//        System.out.println("Response is " + response);
        //with try ...catch
        try {
            response = accountService.witdraw(3000);
            System.out.println("Response is " + response);
        } catch (BalanceNotFoundException es) {
            System.out.println(es.getMessage());
        }

    }
}
