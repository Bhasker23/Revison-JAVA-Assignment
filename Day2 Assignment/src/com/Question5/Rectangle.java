package com.Question5;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(double width2, double length2) {
		super();
		this.width = width2;
		this.length = length2;
	}


	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		
		if (width < 0) {
			this.width = 0;
		}
		else {
			this.width = width;
		}
		
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		
		if (length < 0) {
			this.length = 0;
		}
		else {
			this.length = length;
		}
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.setWidth(-5);
		r1.setLength(-5);
		
		System.out.println(r1.getArea()); 
	}
	
}
