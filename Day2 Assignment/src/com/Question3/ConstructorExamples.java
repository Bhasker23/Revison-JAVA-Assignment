package com.Question3;
class Animal {
		public Animal() {
				System.out.println("Animal Constructor");
		}
}

class Dog extends Animal {
		public Dog() {
				System.out.println("Dog Constructor");
		}
}

class Labrador extends Dog {
		public Labrador() {
				System.out.println("Labrador Constructor");
		}
}

public class ConstructorExamples {
		public static void main(String[] args) {
				Labrador labrador = new Labrador();
		}
}

/*Yes for the above code the super class construct will be called  automatically because  it extents super class any it will not give any error.*/

