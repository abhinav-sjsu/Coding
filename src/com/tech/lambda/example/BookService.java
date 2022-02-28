package com.tech.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	

	public List<Book> getBooksinSort(){
		
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books,new MyComparator());
		return books;
		
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksinSort());
	}

}


class MyComparator implements Comparator<Book> {
	
	
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
