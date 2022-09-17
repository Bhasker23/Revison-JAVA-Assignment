package com.mobilephone;

public class Contact {
	
	private String name;
	private String number;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
	
	public static Contact addContact(String name, String number) {
			
		return  new Contact(name, number);
	}

	@Override
	public String toString() {
		return "Contact Deatils -> name - " + name + ", number - " + number ;
	}
	
	
	
	
}
