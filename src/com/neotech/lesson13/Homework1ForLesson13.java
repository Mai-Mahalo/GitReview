package com.neotech.lesson13;

public class Homework1ForLesson13 {

//	Homework 1:
//	Create an array of countries: north America countries,
//	south America countries, Europe countries, Asian countries,
//	African countries. Then print all values from that
//	array using 2 different loops and calculate how many total countries been stored.

	public static void main(String[] args) {
		
		String[][] countries = {
		{"The USA", "Canada", "Mexico", "Jamaica"},
		{"France", "Italy", "Germany", "Poland", "Switzerland", "Netherland"},
		{"Taiwan", "Singapore", "Malaysia", "Japan"},
		{"Egypt", "South Africa", "Zimbabwe"}};	
		
		// for loop
		int count = 0;
		for (int row = 0; row < countries.length; row++) {
			count += countries[row].length;
			for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");		
			}	
		}
		System.out.println();
		System.out.println("The total number of the countries are " + count);
		System.out.println("-----------------------");
		
	// Advanced loop
	for (String[]col : countries) { // This is for column. column : (What we want to print)
		for (String nations : col ) { // 
			System.out.print(nations + " ");
		}
			
		}
		
		
	}
	


	}


