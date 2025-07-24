package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		// Write a Java program to check if a student has done the Quiz. 
		// If the student did the Quiz, then check the score and give the 
		// following evaluations:
		// ◆ If the score is 90 or greater, print "A, Great job!".
		// ◆ If the score is 80 or greater but less than 90, print "B, Well done!".
		// ◆ If the score is 70 or greater but less than 80, print "C, You passed!".
		// ◆ Otherwise, print "F, You failed"
		// If the student did not do the Quiz, print "You did not do the quiz, 
		// so you failed!"
		
		//Lets plan:
		  //If the quiz is done: 
		      //check the score
		      //If the score is 80 <= score < 90 --->
		      //if the score is 70 <= score < 80 --->
		      //....
		  //Else (no quiz done): ""\You did not do the quiz, so you failed!"
				
		
		int time = 16;
		
		if(time > 16) // > 16 = 16:00 is not included to "Good evening...".
		{
			System.out.println("Good evening,everyone");	
		}
		else 
		{
		    System.out.println("Hello Everyone");	
		}
		
		//I have two double variables, what possible situations are there? = 3
		double d1 = 55.5;
		double d2 = 50;
		
		//if () {}    else {} --- is used to express only two exclusive situations
		//for any other situation which could have more than two outcomes then
		//we can expand the if else condition
		
		/*
		 if ()
		 {
		 
		 }
		 else
		 {
		 
		 }
		 
		 
		 */
		
		if(d1 > d2)
		{  // this part will ONLY get executed if d1 > d2
			System.out.println(d1 + "is bigger than " + d2);
		}
		
		
		else if (d1 < d2) 
		{ // this part will ONLY get execute if d1 < d2
			System.out.println(d1 + "is smaller than " + d2);
		}
		
		
		else 
		{//this part will ONLY get execute if d1 = is equal to d2
			System.out.println(d1 + "is equal " + d2);
		}
		
		
		













	}

}
