package com.sapient.enc.pri;

public class Main {
    public static void main(String[] args) {
        Employee employee =new Employee();
      //  employee.id
        Authentication authentication = new Authentication();
        authentication.setUsername("admin");
        authentication.setPassword("admin");
        String res = authentication.login() ? "Login success" : "Login failed";
        System.out.println(res);
    }
}
