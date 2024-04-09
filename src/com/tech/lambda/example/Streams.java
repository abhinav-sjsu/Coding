/**
 * 
 */
package com.tech.lambda.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

/**
 * @author abhinav.kumar.kapur
 *
 */
public class Streams {
	
	/*
	 * Given a list of integers, find out all the even numbers exist in the list using Stream functions
	 */
	
	public void evenNumbers(List<Integer> listOfNumbers) {
		listOfNumbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
	}
	
	/*
	 * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	 */
	
	public void numbersStartingWithOne(List<Integer> listOfNumbers) {
		listOfNumbers.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	}
	
	/*
	 * How to find duplicate elements in a given integers list in java using Stream functions?
	 */
	
	public void duplicateNumbers(List<Integer> listOfNumbers) {
		Set<Integer> set = new HashSet();
		listOfNumbers.stream()
              .filter(n -> !set.add(n))
              .forEach(System.out::println);
	}
	
	/*
	 * Given the list of integers, find the first element of the list using Stream functions?
	 */
	
	public void firstElement(List<Integer> listOfNumbers) {
		listOfNumbers.stream()
        .findFirst()
        .ifPresent(System.out::println);
	}
	
	/*
	 * Given a list of integers, find the total number of elements present in the list using Stream functions?
	 */
	
	public void numberCount(List<Integer> listOfNumbers) {
        long count =  listOfNumbers.stream()
                .count();
        System.out.println(count);  
		
	}
	
	/*
	 * Given a list of integers, find the maximum value element present in it using Stream functions?
	 */
	
	public void maxElement(List<Integer> listOfNumbers) {
		int max =  listOfNumbers.stream()
                .max(Integer::compare)
                .get();
		System.out.println(max);   
		
	}
	
	/*
	 * Given a String, find the first non-repeated character in it using Stream functions?
	 */
	public void firstNonRepeatedCharacter(String input) {
		Character result = input.chars() // Stream of String       
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
		System.out.println(result);     
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15);
		
		Streams s = new Streams();
		System.out.println("List of Even Numbers are");
		s.evenNumbers(myList);
		System.out.println("List of Numbers starting with One are");
		s.numbersStartingWithOne(myList);
		System.out.println("List of duplicate numbers are");
		s.duplicateNumbers(myList);
		System.out.println("First Element in the list is");
		s.firstElement(myList);
		System.out.println("Total Count of Numbers in the list is");
		s.numberCount(myList);
		System.out.println("Highest Value Element is");
		s.maxElement(myList);

	}

}
