package com.neotech.lesson14;

//Create a class Dog
	// features: breed, size, color, age
	// behaviors: eat(), run(), breed()

public class dog {
	
	// features: primitive or non-primitive data + naming
	
	// self-practice
	
	String breed;
	String size;
	String color;
	int age;
	
	// behaviors
	// void + naming (){
	
	void eat() {
		System.out.println("My dog of " + breed + " with " + color + " eats food a lot.");
	}
	
	void run () {
		System.out.println("My dog with " + age + " year's old and " + size + " runs very fast.");
	}
	
	void breed () {
		System.out.println("My dog " + breed + " is the best dog in the world for me.");
		
	}
	
	// Can i have a main method here? Yes.(but not suggested)
	// Should I have a main method here?  No.
	
	void getInfo() {
		System.out.println("Breed: " + breed);
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age);
	}
	
	
	

}
