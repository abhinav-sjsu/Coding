package com.tech.lambda.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a thread pool with 5 threads
		ExecutorService executorService = Executors.newFixedThreadPool(5); 
		
		// Submit tasks to the thread pool
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println("Thread running from the thread pool: " + Thread.currentThread().getName());
            });
        }

        // Shut down the executor
        executorService.shutdown();

	}

}
