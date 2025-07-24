package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		
		
		// Create an array of names
		String[] names = new String[5];
		
		names[0] = "Sabah";
		names[1] = "Mo";
		names[2] = "Anna";
		names[3] = "Alaric";
		names[4] = "Mikka";
		
		int nameSize = names.length; 
		// we are getting the length of the array
		
		System.out.println(nameSize);
		
		// another way to declare an array:
		int[] scores = {90, 95, 85, 80, 50};
		System.out.println(scores.length); // what is the size of the Array?
		
		// I can change the values of the scores
		scores[4] = 75; 
		
		// but I cannnot changes the size of the array
		
		//notes:
		int a, b, c, d; // declaring 4 int variables
		int [] scores1, scores2, scores3; //declaring 3 int arrays
	
		

	}

}
