package com.Question3;

import java.util.ArrayList;
import java.util.List;

public class Library {

	public static List<Publication> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Book b1 = new Book(200, 355, "Chandu bhai");
		Book b2 = new Book(440, 180, "Kishan lal");
		Book b3 = new Book(180, 700, "Bhopi Dada");
		
		Journal j1 = new Journal(25, 130, "kyo btau");
		Journal j2 = new Journal(40, 25, "Nis btaunga me to");
		
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(j1);
		list.add(j2);
		
		
		System.out.println(list.toString());
	}
}
