package com.neotech.lesson14;

// Video part 1-1
// blueprit = layout (structure, layout), skeleon, 

public class Car {
	
	// What features/attributes does a car have?
	//      make, model, color, year, mpg, max speed: VARIABLE
	
	// What actions does a car do?
	//      drive(), stop(), transportsPeople(): METHODS
	
	// Features: VARIABLE
	String make;
	String model;
	String color;
	int year;
	int mileage;
	boolean manual;
	int maxSpeed;
	
	// Behaviors (action): METHODS
	// returnType methodName()
	void drive()	{ // I'm creating method.
		System.out.println(make +  " " + model + " drives");
		
	}
	
	// void means the method returns nothing.
	
	void stop() {
		System.out.println(make + " stops!");
		System.out.println("Hello there");
	}
	
	void transportPeople() {
		System.out.println(make + " transports people!");
	}
	
	// class is the blueprint (structure, skeleton) that is made of features and behaviors
	
	// what is an object?
	// is an instance/example of a class 
	
	// how can we create an object from the car class?
	   // We have to instantiate the Car class: usually done in main method.
	
	// If we saved and run for the code above, it won't print anything because
	// this is only a structure. No main method
	
	// Can I have a main method here?
	
	public static void main(String[] args) { // will create objects from here.
		// dataType identifier = value;
		int number = 10;
		
		// create a Car object and call it car1
		Car car1 = new Car(); // datatype is "Car"
		// "Car" is a class
		
		// remember the scanner object
		// Scanner scan = newScanner(System.in);
		// = Scanner object is provided by Java, 
		// Car object is created by me.
		
		// lets set some of cars properties
		car1.make = "Toyota";
		car1.model = "Coralla";
		car1.manual = false;
		car1.maxSpeed = 120;
		car1.mileage = 35000;
		car1.year = 2023;
		car1.color = "Grey";
		
		System.out.println("My car is a " + car1.make + " " + car1.model + " " + car1.year);
		
		System.out.println("-------------------------");
		
		// can I also access the behaviors of my car1 object?
		car1.drive(); // Hold command, and point "drive" with the mouse
		car1.stop();
		car1.transportPeople();
		
	
		
		
		
		
		
		
		
		
	}
	
	}
	
	
	

