package com.Question;

public class Animal{
	
	/*Yes a super class reference variable can hold an object of sub class. */
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String type) {
		this.name = type;
	}
	
	
	
}

class Dog extends Animal{
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		
		a1.setName("Pabloo");
		
		System.out.println("Here super class refernece varible holding the value of child class name and with this varible we set the name of dog => " + a1.getName());
		
	}
	
	
}
