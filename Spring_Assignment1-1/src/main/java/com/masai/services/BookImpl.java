package com.masai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.models.Book;
import com.masai.repo.BookRepo;

@Service
public class BookImpl implements BookIntr{

	@Autowired
	private BookRepo bookdb; 
	
	@Override
	public String createBook(Book book) {
		
//		Book b1 = new Book();
//		
//		b1.setName(book.getName());
//		b1.setCategory(book.getCategory());
//		b1.setAuthor(book.getCategory());
//		b1.setPublication(book.getPublication());
//		b1.setPages(book.getPages());
//		b1.setPrice(book.getPrice());
		
		 bookdb.save(book);
		String r = book.getName()+" book has been saved.";
		
		return r;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBook(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
