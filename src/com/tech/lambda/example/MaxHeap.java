package com.tech.lambda.example;

import java.util.PriorityQueue;
/*
Time Complexity: O(N * log(K))
Auxiliary Space: O(K)
 */
public class MaxHeap {
	
	// Function to find top k largest array elements
    static void kLargest(int a[], int n, int k)
    {
        // Implementation using
        // a Priority Queue
        PriorityQueue<Integer> maxHeap
            = new PriorityQueue<Integer>();
 
        for (int i = 0; i < n; ++i) {
 
            // Insert all elements of array into
            // the priority queue
        	maxHeap.add(a[i]);
 
            // If size of the priority
            // queue exceeds k, retrieves and removes the head of the queue
            if (maxHeap.size() > k) {
            	maxHeap.poll();
            }
        }
 
        // Print the top k largest elements
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.peek() + " ");
            maxHeap.poll();
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]
	            = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
	        int n = a.length;
	        int k = 3;
	        System.out.print(k + " largest elements are : ");
	        // Function Call
	        kLargest(a, n, k);

	}

}
