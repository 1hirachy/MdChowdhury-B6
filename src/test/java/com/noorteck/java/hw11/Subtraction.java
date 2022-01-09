package com.noorteck.java.hw11;

public class Subtraction {

	public static void main(String[] args) {
		
	
	int diffTotal = difference21(30);
	System.out.println(diffTotal);
}

	public static int difference21(int number) {
		int result = 0;
		if (number < 21) { // if number is equal to 21 then the value will be 0
			result = (number - 21);
		} else if (number > 21) { // if the number is greater than 21 than the result value will double
			result = ((number - 21) * 2); // unable to create the logic

		} else {
			result = 0;
		}

		return result;
	}
}
/**
 * 1 parameter • Method Name: difference21 • Parameter 1: int number • Method
 * Return Type: int Given an int number, return the difference between variable
 * number and 21 (number-21), except return double the difference if n is over
 * 21. Then call your function from main method: Create an int variable in your
 * main method and assign the value what difference21method returns • Variable
 * Name: int diffTotal;
 */
