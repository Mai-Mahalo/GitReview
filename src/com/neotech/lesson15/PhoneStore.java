package com.neotech.lesson15;

// Video Part 1-1

public class PhoneStore {

	public static void main(String[] args) {
		
		Phone iPhone = new Phone(); // instantiating or creating an object from phone class
		
		iPhone.brand = "Apple";
		iPhone.model = "16 pro max";
		iPhone.color = "white";
		iPhone.price = 850;
		
		iPhone.call();
		iPhone.text();
		iPhone.navigate();
		
		System.out.println("--------------");
		
		Phone android = new Phone();
		
		android.brand = "Samsung";
		android.model = "S24";
		android.color = "black";
		android.price = 750;
		
		android.call();
		android.text();
		android.navigate();
		
		System.out.println("--------------");
		
		Phone nokia = new Phone();
		
		nokia.brand = "Nokia";
		nokia.color = "grey";
		nokia.model = "3210";
		nokia.price = 200;
		
		nokia.call();
		nokia.text();
		nokia.navigate();
		
		System.out.println("----------------"); // This is from Git Review class below.
		
		System.out.println("Elion made some changes here");
		
		
		
		
		
		
		
		

	}

}
