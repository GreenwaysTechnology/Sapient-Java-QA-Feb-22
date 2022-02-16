package com.sapient.oo.typing;

public class StringsDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str + " its hashcode " + str.hashCode());
        //do some state changes
        String upperStr = str.toUpperCase();
        System.out.println(upperStr + " its hashcode " + upperStr.hashCode());

        StringBuffer buffer = new StringBuffer();
        System.out.println("Inital Buffer hash code " + buffer.hashCode());
        //modify the buffer
        StringBuffer newBuffer= buffer.append("hello");
        System.out.println("After Modification Buffer hash code " + newBuffer.hashCode());

    }
}
