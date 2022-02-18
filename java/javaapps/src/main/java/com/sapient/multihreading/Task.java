package com.sapient.multihreading;

public class Task implements Runnable {
    //Thread logic
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + Thread.currentThread().getName());

        }
    }
}
