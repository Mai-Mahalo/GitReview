package com.neotech.lesson14;

public class Shelter {

	// Create a class Shelter
    // create 3 objects of class Dog and initialize the values for each
	
	public static void main(String[] args) {
		
		
	// Can i do this? YES, we may instantiate the objects before assigning value	
		dog dog1 = new dog();
		dog dog2 = new dog();
		dog dog3 = new dog();
		
	// Set the properties of the objects.(=attributes)
		dog1.age = 3;
		dog1.breed = "Poodle";
		dog1.size = "small";
		dog1.color = "Brown";
		
		dog2.age = 7;
		dog2.breed = "Husky";
		dog2.color = "white";
		dog2.size = "medium";
		
		dog3.age = 1;
		dog3.breed = "Jack Russell";
		dog3.color = "white";
		dog3.size = "small";
		
		// lets call the methods now
		dog1.eat();
		dog1.run();
		dog1.breed();
		
		System.out.println("------------------");
		
		dog3.eat();
		dog3.run();
		dog3.breed();
		
		System.out.println("------------------");
		
		dog2.run();
		dog2.eat();
		dog2.breed();
		
		System.out.println("------------------");
		
		dog3.getInfo();
		
		dog3.age = 3;
		
		dog3.getInfo();
		
		

		
		
		
		
		
	

	}

}
