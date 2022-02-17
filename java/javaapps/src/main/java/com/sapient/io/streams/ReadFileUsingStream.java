package com.sapient.io.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileUsingStream {
    public static void main(String[] args) {
        System.out.println("File input stream");
        String filename = "E:\\session\\sapient\\Java-QA\\javaapps\\src\\main\\resources\\hello.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);


//            int singleByte = fileInputStream.read();
//            System.out.println("data in bytes => " + singleByte);
            int data;
            while ((data = fileInputStream.read()) != -1) {
              //  System.out.println(data + "  " + (char) data);
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file Not found" + e);
        } catch (IOException e) {
            System.out.println("IO Exception" + e.getMessage());
        }
    }
}
