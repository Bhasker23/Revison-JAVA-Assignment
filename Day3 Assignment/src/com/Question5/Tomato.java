package com.Question5;

public class Tomato implements Fruit, Vegetable {
	
	public static void main(String[] args) {
		
		Tomato tomato = new Tomato();
		tomato.hasAPeel();
		tomato.hasARoot();
		
		
		
		
	}

	@Override
	public void hasAPeel() {
		System.out.println("Hey, I am fruit please peel me..  ");
		
	}

	@Override
	public void hasARoot() {
		System.out.println("Hey, I am Vegetable and I have roots..  ");
		
	}





}
