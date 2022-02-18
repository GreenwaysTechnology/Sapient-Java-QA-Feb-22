package com.sapient.multihreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main " + Thread.currentThread().getName());
        //
        for (int i = 0; i < 10; i++) {
            Thread taskThread = new Thread(new Task());
            // taskThread.setName("Task Thread");
            //start the thread
            taskThread.start();
        }
    }

}
