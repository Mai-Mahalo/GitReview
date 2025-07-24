package com.neotech.lesson14;

public class Homework1ForLesson14_Objects {

//Homework 1:
//  Create a Class "Phone". Create 3 Objects of it: 
//  iPhone, Android, Nokia with specific  attributes and behaviors.
	
	public static void main(String[] args) {
		
        //instantiate the objects before assigning values
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		//Properties (= attributes)
		phone1.brand = "iPhone";
		phone1.color = "purple";
		phone1.OS = "iOS";
		phone1.memory = "125GB";
		
		phone2.brand = "Google Pixel";
		phone2.color = "black";
		phone2.OS = "Andoroid";
		phone2.memory = "512GB";
		
		phone3.brand = "Nokia";
		phone3.color = "pink";
		phone3.OS = "Andoroid";
		phone3.memory = "256GB";
		
		phone1.Photos();
		phone1.talk();
		
		System.out.println("------------");
		
		phone3.Photos();
		phone3.talk();
		
		System.out.println("------------");
		
		phone2.Photos();
		phone2.talk();
		
		
		}
		
		
		
		
		
		
		
		
		
		

	}


