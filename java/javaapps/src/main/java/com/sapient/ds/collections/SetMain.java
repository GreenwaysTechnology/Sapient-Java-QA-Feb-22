package com.sapient.ds.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void createHashSet() {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(12);
        integerSet.add(100);
        integerSet.add(1);
        for (Integer ins : integerSet) {
            System.out.println(ins);
        }
        Set<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new Employee(1, "A1", 100.89));
        employeeHashSet.add(new Employee(3, "A3", 1070.89));
        employeeHashSet.add(new Employee(3, "A3", 1070.89));
        employeeHashSet.add(new Employee(2, "A2", 10330.89));
        employeeHashSet.add(new Employee(5, "A5", 10670.89));
        employeeHashSet.add(new Employee(5, "A5", 10670.89));

        for (Employee employee : employeeHashSet) {
            System.out.println(employee);
        }
    }

    //
    public static void createLinkedHashSet() {
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(12);
        integerSet.add(12);
        integerSet.add(100);
        integerSet.add(1);
        for (Integer ins : integerSet) {
            System.out.println(ins);
        }
        Set<Employee> employeeHashSet = new LinkedHashSet<>();
        employeeHashSet.add(new Employee(1, "A1", 100.89));
        employeeHashSet.add(new Employee(3, "A3", 1070.89));
        employeeHashSet.add(new Employee(3, "A3", 1070.89));
        employeeHashSet.add(new Employee(2, "A2", 10330.89));
        employeeHashSet.add(new Employee(5, "A5", 10670.89));
        employeeHashSet.add(new Employee(5, "A5", 10670.89));

        for (Employee employee : employeeHashSet) {
            System.out.println(employee);
        }
    }
    public static void createTreeSet() {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(12);
        integerSet.add(12);
        integerSet.add(100);
        integerSet.add(1);
        for (Integer ins : integerSet) {
            System.out.println(ins);
        }
        Set<Employee> employeeHashSet = new TreeSet<>(new EmployeeIdDecendingOrder());
        employeeHashSet.add(new Employee(1, "A1", 100.89));
        employeeHashSet.add(new Employee(3, "A3", 1070.89));
        employeeHashSet.add(new Employee(3, "A3", 1070.89));
        employeeHashSet.add(new Employee(2, "A2", 10330.89));
        employeeHashSet.add(new Employee(5, "A5", 10670.89));
        employeeHashSet.add(new Employee(5, "A5", 10670.89));

        for (Employee employee : employeeHashSet) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        //createHashSet();
        //createLinkedHashSet();
        createTreeSet();
    }
}
