package com.Question2;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

//a) Which of the line will give error and Why ?

interface ExampleInterface1 {
		int value1 = 10; // Line 1
		public int value2 = 15; // Line 2
		public static int value3 = 20; // Line 3
		public static final int value4 = 25; // Line 4
//		private int value5 = 10; // Line 5
		
		/*Line 5 will give an error because it  is written as private modifier and we can not use private in interface*/
}


//b) Below code will give error or not ? If Yes, Then give reason

interface ExampleInterface2 {
		void method1();

		default void method5() {
				System.out .println("Method5");
		}
}

/* The above code will not give any kind of error.
 * 
 
class Main implements ExampleInterface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.method1();
		main.method5();
	}
}

*/
