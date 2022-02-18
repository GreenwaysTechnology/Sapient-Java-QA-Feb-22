package com.sapient.ds.collections;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(56);
        list.addLast(222);
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
