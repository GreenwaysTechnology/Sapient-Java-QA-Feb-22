package com.sapient.oo.typing;

public class TypeConversionPrimitive {
    public static void main(String[] args) {
        byte b = 10;
        System.out.println(b);
        byte b1 = 100;
        System.out.println(b1);
        byte b2 = (byte) 128; //int is converted into byte
        System.out.println(b2);
        //float and double
        float f = (float) 10.5;
        float f1 = 10.5f;
        long l = 10L;
        char a = 'a';
        char c = 100;
        System.out.println(a + " " + c);
    }
}
