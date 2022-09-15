package com.Question3;

public abstract class Publication {
	
	 int noOfPages;
	 int price;
	 String publisherName;
	 
	 public Publication() {
		// TODO Auto-generated constructor stub
	}
	 
	public Publication(int noOfPages, int price, String publisherName) {
		super();
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
		
}
