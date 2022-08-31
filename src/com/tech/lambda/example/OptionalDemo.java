package com.tech.lambda.example;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> hello = Optional.ofNullable("Hello");
		
		System.out.println(hello.isPresent());
		
		System.out.println(hello.isEmpty());
		
//		String orElse = hello.orElse(other:"World");
//		
//		System.out.println(orElse);

	}

}
