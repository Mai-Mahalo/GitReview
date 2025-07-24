package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwtich {

	public static void main(String[] args) {
		
		// ask the user to enter their country
		// then print the language they speak
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("Enter your coutry:");
		
		String country = myScanner.nextLine();
		
		switch(country) {
		case "Azerbaijan":
			System.out.println("You speak Azerbaijan");
			break;
		case "Turkiye":
			System.out.println("You speak Turkish");
			break;
		case "Mexico":
			System.out.println("You speak Spanish");
			break;
		case "Philippines":
		    System.out.println("You speak Tanalog");
		    break;
		case "Netherland":
			System.out.println("You speak Dutch");
			break;
		case "USA":
		case "Canada":
		case "England":
		case "Australia":
			System.out.println("You speak English");
			break;
		default:
			System.out.println("Oh I dont know about this one!");
			break;
		
		}
		
		// we can use "==" for "equlas".
		
		if(country.equals("Azerbaijan"))
		{
			System.out.println("You speal Azerbaijan");
		}
		else if (country.equals("Turkiye"))
		{
			System.out.println("You speak Turkish");
		}
		
		{
		
		}
		myScanner.close();
		

	}

}
