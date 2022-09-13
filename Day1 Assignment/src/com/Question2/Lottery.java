package com.Question2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int number = rd.nextInt(100,999);

		
		List<String> num = Arrays.asList(Integer.toString(number).trim().split(""));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Lottery Number..");
		String string = sc.next();

		
		List<String> lNum = Arrays.asList(string.trim().split(""));
		
		
		
		if(num.equals(lNum)) {
			System.out.println("You have won 10,000 $ Money in Lottery ");
		}
		else {
			
			int count = 0;
			
			for(int i = 0; i<num.size(); i++) {
//				System.out.println(num.get(i) +" "+ (lNum.get(i)));
				if (num.contains(lNum.get(i))) {
					
					count++;
				}
			}
			
			if (count == 3) {
				System.out.println("You won 3000 $ in Lottery..");
			}
			else if (count == 1) {
				System.out.println("You won 1000 $ in Lottery..");
			}
			else {
				System.out.println("oh sorry..Better luck next time..");
			}
			
		}
		
//		System.out.println(num+" "+lNum);
	}
}
