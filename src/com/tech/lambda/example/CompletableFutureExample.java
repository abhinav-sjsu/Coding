package com.tech.lambda.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Thread running asynchronously: " + Thread.currentThread().getName());
        });

        // Block and wait for the future to complete
        future.join();

	}

}
