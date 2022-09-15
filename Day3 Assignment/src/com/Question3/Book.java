package com.Question3;

public class Book extends Publication {
	
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Book(int noOfPages, int price, String publisherName) {
		super(noOfPages, price, publisherName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [noOfPages=" + noOfPages + ", price=" + price + ", publisherName=" + publisherName + "]";
	}
	
	
	
}
