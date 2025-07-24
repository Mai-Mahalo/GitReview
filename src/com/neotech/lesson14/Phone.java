package com.neotech.lesson14;

//Homework 1:
//    Create a Class "Phone". Create 3 Objects of it: 
//    iPhone, Android, Nokia with specific  attributes and behaviors.

public class Phone {
	
	// features: primitive or non-primitive data + naming
	String brand;
	String color;
	String OS;
	String memory;
	
	// Property (= methods, = attribution), behaviors
	// void + naming (){
	void Photos () {
		System.out.println("I can save photos in " + memory + " of " + brand + ".");
	}
	void talk () {
		System.out.println("I can download WhatsApp to call people via " + OS + ".");
	}
	
	void getInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("OS: " + OS);
		System.out.println("Memory: " + memory);
		
	}
	
		
		
	}
	
	
	
	

