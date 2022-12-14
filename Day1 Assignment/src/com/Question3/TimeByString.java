package com.Question3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeByString {
	
	public static void main(String[] args) {
		
		LocalTime b = LocalTime.now();
		
		String s3 = "Value1";
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
				s3 = s3 + s2;
		}
		
		LocalTime a = LocalTime.now();
		long time = ChronoUnit.SECONDS.between(b, a);
		System.out.println("Time taken by String Loop is - " + time  + "Seconds" );
		
//		Time taken by String Loop is - 11 Seconds.
	}
}
