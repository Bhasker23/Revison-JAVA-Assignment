package com.masai.services;

import java.util.List;

import com.masai.models.Book;

public interface BookIntr {

	public String createBook(Book book);
	
	public List<Book> getAllBooks();
	
	public Book getBook(String name);
	
	public String updateBook(Book book);
	
	public String DeleteBook(Book book);
}
