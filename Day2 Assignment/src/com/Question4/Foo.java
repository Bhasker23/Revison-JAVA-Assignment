package com.Question4;

class Foo{
	public void doIt(int number){
		System.out.println("A");
	}

	public void doIt(String string){
		System.out.println("B");
	}
}

class Bar extends Foo{
	public void doIt(float number){
		System.out.println("C");
	}

	public static void main(String[] args) {
		
		Bar x = new Bar();
		x.doIt("hello");
		
//		The above line will give a output as B because this class extends Foo class and it calls overloaded method of string type
	}


}
