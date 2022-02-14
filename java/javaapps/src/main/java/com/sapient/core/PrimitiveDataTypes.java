package com.sapient.core;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //variables
        //whole numbers
        byte byteVariable = 10;
        short shortVariable = 199;
        int intVariable = 9000;
        long longVariable = 900;
        System.out.println("Whole Numbers : Integer");
        System.out.println("Byte " + byteVariable);
        System.out.println("Short " + shortVariable);
        System.out.println("Int  " + intVariable);
        System.out.println("Long " + longVariable);
        //literals
        //decimal number
        //hexa decimal
        //octal numbers
        // The number 26, in decimal
        int decVal = 26;
//  The number 26, in hexadecimal
        int hexVal = 0x1a;
// The number 26, in binary
        int binVal = 0b11010;
        System.out.println("Decimal Literal " + decVal);
        System.out.println("Hexa Decimal " + hexVal);
        System.out.println("binValue " + binVal);

        System.out.println("Precision Numbers : Floating points");
        float floatVariable = 10.5f;
        double doubleVariable = 90.78;
        System.out.println("Float  " + floatVariable);
        System.out.println("Double " + doubleVariable);
        //chars
        System.out.println("Characters : Single Char");
        char c = 'a';
        System.out.println("Char  " + c);
        //collection of Characters
        System.out.println("Characters : multi Char");
        String stringVariable = "hello";
        System.out.println("Strings  " + stringVariable);
        //boolean
        System.out.println("Boolean : true/false");
        boolean booleanVariable = true;
        System.out.println("Boolean  " + booleanVariable);


    }
}
