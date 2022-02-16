package com.sapient.oo.typing;

public class StringToNumberConversion {
    public static void main(String[] args) {
        String n1 = "10";
        String n2 = "20";
        //Type Conversion : WrapperTypeParseMethod
        int c = Integer.parseInt(n1) * Integer.parseInt(n2);
        System.out.println(c);

    }
}
