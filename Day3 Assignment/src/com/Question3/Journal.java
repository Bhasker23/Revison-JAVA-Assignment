package com.Question3;

public class Journal extends Publication{

	
	public Journal() {
		// TODO Auto-generated constructor stub
	}
	
	public Journal(int noOfPages, int price, String publisherName) {
		super(noOfPages, price, publisherName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Journal [noOfPages=" + noOfPages + ", price=" + price + ", publisherName=" + publisherName + "]";
	}
	
	
}
