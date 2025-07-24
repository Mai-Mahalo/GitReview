package com.neotech.lesson15;

public class Email_HW1ForLesson15 {
	
	//Create a method createEmail(). Based on provided users firstName, lastName and emailType, 
	//your method should return complete email address.
	//
	//Example: 
	//firstName -> john
	//lastName -> snow
	//emailType -> gmail
	//return -> johnsnow@gmail.com

	public static void main(String[] args) {
	  
		Email member1 = new Email();
		
		member1.firstName = "Mai";
		member1.lastName = "Malanog";
		member1.eMail = "maiXXXX@gmail.com";
			
		System.out.println(member1.returnName1());
		System.out.println(member1.returnName2());
		System.out.println(member1.returnEmail());
			
		
			
		}
		

	}


