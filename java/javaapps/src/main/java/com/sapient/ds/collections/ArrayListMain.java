package com.sapient.ds.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(10); // list.add(new Integer(10)) Object o = new Integer
//        list.add("Hello");
//        //iterate
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer ins = (Integer) iterator.next();
//            System.out.println(ins.intValue() * 10);
//        }

        //Generics Version
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // list.add(new Integer(10)) Object o = new Integer
        //list.add("hello");
        list.add(20);
        //iterate
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer ins = (Integer) iterator.next();
            System.out.println(ins.intValue() * 10);
        }
        //iterators - for ...each
        for (Integer ins : list) {
            System.out.println(ins.intValue() * 100);
        }
        //
        list.forEach(ins -> {
            System.out.println(ins.intValue() * 100);
        });
        //processing array

    }
}
