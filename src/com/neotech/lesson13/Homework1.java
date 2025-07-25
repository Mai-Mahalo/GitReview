package com.neotech.lesson13;

// Video Part 1-1

public class Homework1 {
	
//	1. Create a 2D array where you will store the following values:
//	- Mr, Mrs, Ms, Miss
//	-Smith, Jordan, Jackson, Obama.	

//    After storing values print the following:
//	Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//
//	* Be careful because they are mixed.


	public static void main(String[] args) {
		
		String[][]names = {
				{"Mr. ", "Mrs. ", "Ms. ", "Miss. "},
				{"Smith", "Jordan", "Jackson", "Obama"}};
		
		// 0 1 2 3
		// row 0 Mr Mrs Ms Miss
		// row 1 Smith Jordan Jackson Obama
		
		// Mrs. Smith
		System.out.println(names[0][1] + names [1][0]);
		
		// Mr. Obama
		System.out.println(names[0][0] + names[1][3]);
		
		// Miss. Jordan
		System.out.println(names[0][3] + names [1][1]);
	
		
		}
	
	// This is for Git Review class
	public void test1()
	{
		System.out.println("This is test 1");
	}
		
		}
		
	





