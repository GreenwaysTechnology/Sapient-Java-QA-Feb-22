package com.sapient.oo.nullvalue;

public class NullMain {
    public static void main(String[] args) {
        //here employee variable has valid memory address
        Employee employee = new Employee();

        //employee1 variable is not pointing any valid object location
        Employee employee1 = null;
        //if you try to access any property on "Employee" type and its object location not there so it will throw error
        //runtime error.
        employee1.setId(10);

    }
}
