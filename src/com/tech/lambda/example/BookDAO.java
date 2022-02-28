package com.tech.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(101,"Core Java",400));
		books.add(new Book(102,"Hibernate",180));
		books.add(new Book(103,"Spring",200));
		books.add(new Book(104,"WebService",300));
		
		return books;
	}

}
