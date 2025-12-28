package com.kumar.java8.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks() {
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core java", 400));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "Web Service", 300));	
		books.add(new Book(363, "Hibernate", 180));
		
		return books;
	}

}
