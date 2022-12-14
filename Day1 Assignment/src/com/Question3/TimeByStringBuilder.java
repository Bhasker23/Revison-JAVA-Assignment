package com.Question3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeByStringBuilder {


	public static void main(String[] args) {
		
		LocalTime b = LocalTime.now();
		
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
			s3.append(s2);
		}
		LocalTime a = LocalTime.now();
		
		long time = ChronoUnit.MILLIS.between(b, a);
		
//		System.out.println(s3);
		System.out.println("Time taken by StringBuilder Loop is - " + time  + " Milli Seconds" );
		
//		Time taken by StringBuilder Loop is - 30 MilliSeconds
	}
}
