package com.Question1;

import java.util.Scanner;

public class InsideCircle {

	public static void main(String[] args) {
		
		int r = 10;
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Enter the point x ");
		int x  = scanner.nextInt();
		
		System.out.println("Enter the point y ");
		int y = scanner.nextInt();
		
		if (((x*x) + (y*y)) < (r*r)) {
			
			System.out.println("Inside the Circle ");
		} else {
			System.out.println("Outside the Circle ");
		}
		
	}
}
