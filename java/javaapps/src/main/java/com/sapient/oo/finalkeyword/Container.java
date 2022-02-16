package com.sapient.oo.finalkeyword;

public class Container {
    public static final double PI = 3.14;
    final int a = 0;

    //localvariables
    public void getValue() {
        final int b = 10;
        //b=90;
        System.out.println(b);
    }

    public final void setValue() {
        System.out.println("value is set");
    }
}
