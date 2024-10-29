package com.tech.lambda.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AvoidDeadlockExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> acquireLocks(lock1, lock2));
        Thread t2 = new Thread(() -> acquireLocks(lock2, lock1));

        t1.start();
        t2.start();
    }

    private static void acquireLocks(Lock firstLock, Lock secondLock) {
        while (true) {
            // Try to acquire both locks
            boolean gotFirstLock = firstLock.tryLock();
            boolean gotSecondLock = secondLock.tryLock();

            try {
                if (gotFirstLock && gotSecondLock) {
                    System.out.println("Acquired both locks, performing action...");
                    break;  // Both locks acquired, proceed with critical section
                }
            } finally {
                // Release locks if not acquired both
                if (gotFirstLock) firstLock.unlock();
                if (gotSecondLock) secondLock.unlock();
            }

            // Wait a bit before retrying
            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
        }
    }
}
