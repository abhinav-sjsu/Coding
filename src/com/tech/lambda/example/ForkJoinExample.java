package com.tech.lambda.example;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinExample extends RecursiveTask<Integer> {
	
	private static final long serialVersionUID = 1L;
	private final int threshold = 5;
    private final int[] numbers;
    private final int start, end;

    public ForkJoinExample(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= threshold) {
            // Simple sum computation for small task
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return sum;
        } else {
            // Split task into smaller subtasks
            int middle = (start + end) / 2;
            ForkJoinExample leftTask = new ForkJoinExample(numbers, start, middle);
            ForkJoinExample rightTask = new ForkJoinExample(numbers, middle, end);

            leftTask.fork();  // Perform the task asynchronously
            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();

            return leftResult + rightResult;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinExample task = new ForkJoinExample(numbers, 0, numbers.length);
        int result = pool.invoke(task);
        System.out.println("Result: " + result);

	}

}
