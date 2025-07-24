package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {
		
		// sysout + Cmd + Space
		System.out.println("Whats up everyone");
		
		//println ---> prints the statement and move the cursor into the next line
		//print ---> print the statements and keeps the cursor in line (does not go to the next line)
		
		System.out.println("How are you doing?");
		
		System.out.print(1); // after printing 1, cursor stays in the same line
		System.out.print("2"); // this is printed where the cursor is 
		System.out.print("3"); // this is also printed where the cursor is
		
		System.out.println("4");// this will print next to 3, the cursor will move to the next line
		System.out.println("5");// this will print in new line and the cursor moves to the next line
		System.out.println("6");// this will print in new line and the cursor moves to the new line
		
		// \n ---> same as hitting enter (move to the next line)
		System.out.println("Do you like Java? \nYes I do!");
		
		System.out.println("\n"); // Creating two lines
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		// we can also have several /n in a single statement
		System.out.println("\n\n\n");
		System.out.println("Something else");
		
		//Shortcuts: Cmd + / ---> Single line comment
		//           Cmd + SHIFT + / ---> multi line comment
		
//		comment line 1
//		comment line 2
//		comment line 3
//		comment line 4

	}

}
