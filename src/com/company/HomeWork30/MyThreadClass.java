package com.company.HomeWork30;

public class MyThreadClass implements Runnable {
    private int counter = 0;

    @Override
    public void run() {
        System.out.println("Count start = " + counter);
        while (!Thread.currentThread().isInterrupted()) {
            counter++;
        }
        System.out.println("Count finish = " + counter);
    }
}