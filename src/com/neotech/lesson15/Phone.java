package com.neotech.lesson15;

public class Phone {
	
//  Homework 1:
//  Create a Class "Phone". Create 3 Objects of it: 
//  iPhone, Android, Nokia with specific  attributes and behaviors.
	
	// Lets create some properties/attributes for phones.
	
	String brand, model, color;
	int price;
	
	
	// Behaviors
	void call () {
		System.out.println(brand + " makes calls!");
	}
	
	void text() {
		System.out.println(brand + " text!");
	
	}
	
	void navigate() {
		System.out.println(brand + " navigates!");
	}
	
	// This method is added by Elion (This is for Git Review class)
	void installApplicaton(String appName) {
		System.out.println("Installing the application");
		
	}


}
