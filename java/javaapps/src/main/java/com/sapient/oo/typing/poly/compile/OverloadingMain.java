package com.sapient.oo.typing.poly.compile;

public class OverloadingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 10));
        System.out.println(calculator.add(1, 3, 4));
        System.out.println(calculator.add(10.4, 19.8));

        //overloading
        Employee emp = new Employee();
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee("ff");
        Employee emp3 = new Employee(1, "ddd");
    }
}
