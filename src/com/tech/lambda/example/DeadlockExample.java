package com.tech.lambda.example;

public class DeadlockExample {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(50); } catch (InterruptedException ignored) {}
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { Thread.sleep(50); } catch (InterruptedException ignored) {}
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
