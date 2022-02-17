package com.sapient.io.serialization;

import java.io.*;

public class SaveObjectMain {
    public static void saveObject() throws IOException {
        Customer customer = new Customer(1, "Subramanian", "Coimbatore");
        String filename = "customer.ser";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //write objects into stream
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }

    }

    public static void readObject() {
        try {
            //Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("customer.ser"));
            Customer customer = (Customer) in.readObject();
            //printing the data of the serialized object
            System.out.println("From the disk : " + customer);
            //closing the stream
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws IOException {
        saveObject();
        readObject();
    }
}
