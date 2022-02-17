package com.sapient.exceptions;

public class UnCheckedException {

    static void checkNullException() {
        String str = null;
        System.out.println(str.length());
    }

    static void checkNumberFormate() {
        String str = "$10";
        int a = Integer.parseInt(str);
        System.out.println(a);
    }

    static void handleException() {
        try {
            //your application
            String str = "$10";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException es) {
            //reporting block
            System.out.println(es.getMessage());
        }

    }


    public static void main(String[] args) {
        //checkNullException();
        //  checkNumberFormate();
        handleException();
        System.out.println("Test");
    }
}
