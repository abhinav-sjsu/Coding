
/*
 * ZScaler Interview Questions for Staff SWE
 * Given a set of investment projects with their respective profits, we need to find the most profitable projects. 
 * We are given an initial capital and are allowed to invest only in a fixed number of projects. 
 * Our goal is to choose projects that give us the maximum profit. Write a function that returns the maximum total capital after 
 * selecting the most profitable projects.We can start an investment project only when we have the required capital. 
 * Once a project is selected, we can assume that its profit has become our capital.
 * 
 * Input: Project Capitals=[0,1,2], Project Profits=[1,2,3], Initial Capital=1, Number of Projects=2
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution10 {
	
	public int maximumCapital(int k, int w, int[] profits, int[] capital) {
		
		PriorityQueue<int[]> minCapitalHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		
		PriorityQueue<int[]> maxProfitHeap = new PriorityQueue<>((a,b) -> b[1] -a[1]);
		
		for(int i=0; i< profits.length;i++) {
			minCapitalHeap.add(new int[] {capital[i],profits[i]});
		}
		
		for(int i=0;i<k;i++) {
			while(!minCapitalHeap.isEmpty() && minCapitalHeap.peek()[0] <= w) {
				int[] project = minCapitalHeap.poll();
				maxProfitHeap.add(project);
			}
			
			if(maxProfitHeap.isEmpty()) {
				break;
			}
			
			w = w + maxProfitHeap.poll()[1];
		}
		
		return w;
		
	}
	
	//Given a number n, find sum of all numbers up to n.
	
	public int sumUp(int n) {
		return n * (n+1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution10 s = new Solution10();
		int k=2;
		int w=0;
		int[] profits = {1,2,3};
		int[] capital = {0,1,1};
		System.out.println(s.maximumCapital(k, w, profits, capital));
		System.out.println(s.sumUp(5));



}

}
