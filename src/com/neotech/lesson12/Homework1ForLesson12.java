package com.neotech.lesson12;

public class Homework1ForLesson12 {

//	1. Create a 2D array where you will store the following values:
//		- Mr, Mrs, Ms, Miss
//		-Smith, Jordan, Jackson, Obama.	
	
//	    After storing values print the following:
//		Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//
//		* Be careful because they are mixed.
	
	public static void main(String[] args) {
		String[][]names = {{"Mr. ", "Mrs. ", "Ms. ", "Miss. "}, {"Smith", "Jordan", "Jacson", "Obama"}};
		System.out.println(names[0][1] + names[1][0] + ", " + names[0][0] + names[1][3] + ", " + names [0][2] + names [1][2] + ", " + names [0][3] + names[1][1]);
		

	}

}
