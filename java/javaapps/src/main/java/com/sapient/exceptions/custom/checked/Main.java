package com.sapient.exceptions.custom.checked;

public class Main {
    public static void main(String[] args) { // throws BalanceNotFoundException {
        AccountService accountService = new AccountService();
        double response = 0.0;
        try {
            response = accountService.witdraw(1000);
            System.out.println("Response is " + response);
        } catch (BalanceNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("called");
        }
    }
}
