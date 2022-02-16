package com.sapient.oo.isa;

public class InheritanceMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println(savingsAccount.accountId);
        System.out.println(savingsAccount.deposit());
    }
}
