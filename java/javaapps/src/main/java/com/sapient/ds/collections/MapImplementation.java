package com.sapient.ds.collections;

import java.util.*;

public class MapImplementation {
    public static void main(String[] args) {
        //   createHashMap();
        //createLinkedHashMap();
        createTreeMap();
    }
    public static void createTreeMap() {
        Map<Integer, Integer> hash = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return  (x > y) ? -1 : ((x == y) ? 0 : 1);
            }
        });
        hash.put(1, 100);
        hash.put(4, 400);
        hash.put(5, 500);
        hash.put(3, 300);
        hash.put(2, 200);

        //convert map into set/Collection view for interation
        Set<Integer> keys = hash.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection<Integer> values = hash.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) //using map.entrySet() for iteration
        {
            System.out.println("id: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void createLinkedHashMap() {
        Map<Integer, Integer> hash = new LinkedHashMap<>();
        hash.put(1, 100);
        hash.put(4, 400);
        hash.put(5, 500);
        hash.put(3, 300);
        hash.put(2, 200);

        //convert map into set/Collection view for interation
        Set<Integer> keys = hash.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection<Integer> values = hash.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) //using map.entrySet() for iteration
        {
            System.out.println("id: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }



    public static void createHashMap() {
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(1, 100);
        hash.put(4, 400);
        hash.put(5, 500);
        hash.put(3, 300);
        hash.put(2, 200);

        //convert map into set/Collection view for interation
        Set<Integer> keys = hash.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection<Integer> values = hash.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) //using map.entrySet() for iteration
        {
            System.out.println("id: " + entry.getKey() + ", Value: " + entry.getValue());
        }


    }
}
