package com.neotech.lesson11;

public class Homework3ForLesson11 {

	public static void main(String[] args) {
		
//		Homework 3:
//		Create an array of countries. While retrieving all values from an array print capital for each country.
		
        String[] countries = new String [3];
        countries[0] = "Japan";
        countries [1] = "The United States";
        countries [2] = "Canada";
        		
        String[] CapitalCities = new String [3];
        CapitalCities[0] = "Tokyo";
        CapitalCities[1] = "Washington D.C";
        CapitalCities[2] = "Ottawa";
        
 // Another way: String[] countries = ("XXX", "YYY", "ZZZ");
        
        System.out.println("The capital city of " + countries[0] + " is " + CapitalCities[0] + ".");
        System.out.println("The capital city of " + countries[1] + " is " + CapitalCities[1] + ".");
        System.out.println("The capital city of " + countries[2] + " is " + CapitalCities [2] + ".");
        


	}

}
