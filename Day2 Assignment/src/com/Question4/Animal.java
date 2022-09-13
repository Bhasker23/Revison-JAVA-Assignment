package com.Question4;

/*
class Test {
    int a, b;

	Test(){
		this(2, 4);
	}

	Test(int a, int b){
		this();
	}
    public static void main(String[] args) {
       Test a = new Test();
    }
}

The above code will give an error because there is a recursive call between both the constructor.


*/


class Animal{

	String name;

	Animal(){
		this.name = "Lion"; 
	}

	public Animal(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		
		
		Animal a = new Animal("tiger");
		System.out.println(a.name); 
		
//		The above line give  output as Tiger.

		Animal b = new Animal(); 
		System.out.println(b.name); 
		
//		The above line give  output as lion.
	}
	
}





