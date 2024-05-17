package com.tech.lambda.example;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Doom");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		//stack.pop();
		System.out.println(stack.peek());
		
		System.out.println(stack.search("Borderlands"));
		
		System.out.println(stack);

	}

}
