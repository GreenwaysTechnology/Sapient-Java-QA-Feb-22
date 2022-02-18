package com.sapient.ds.collections;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(3);
        integers.push(2); // l
        int vale = integers.pop(); // last value in the stack will be read
        System.out.println(vale);
    }
}
