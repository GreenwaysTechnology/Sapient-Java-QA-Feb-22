package com.sapient.io.scannerio;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
