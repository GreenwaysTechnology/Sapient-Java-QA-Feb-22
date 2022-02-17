package com.sapient.oo.instanceofoperator;

public class InstanceOfMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee instanceof  Employee);
        System.out.println(employee instanceof  Object);
        System.out.println(employee instanceof  MyInterface);
    }
}
