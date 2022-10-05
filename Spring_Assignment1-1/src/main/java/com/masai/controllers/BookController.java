package com.masai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Book;
import com.masai.services.BookImpl;

@RestController
@RequestMapping("/bookservice")
public class BookController {

	@Autowired
	BookImpl bookImpl;
	
	@PostMapping("/books")
	public String saveBook(@RequestBody Book book) {
		
	
		return bookImpl.createBook(book);
	}
	 
}
