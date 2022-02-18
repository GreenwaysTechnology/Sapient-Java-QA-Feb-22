package com.sapient.ds.collections;

import java.util.Comparator;

public class EmployeeIdDecendingOrder implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return (employee1.getId() > employee2.getId()) ? -1 : ((employee1.getId() == employee2.getId()) ? 0 : 1);
    }
}
