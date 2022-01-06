package com.noorteck.java.hw11;

public class MonkeyStatus {

	public static void main(String[] args) {
		boolean monkeyA = true; // we created a boolean variable monkeyA and set its value to true
		boolean monkeyB = true; //we created a boolean value monkeyB & set its value to true

		boolean areWeInTrouble = monkeyTrouble(monkeyA, monkeyB); // we have placed our monkeyTrouble method & its value to a variable named areWeIntrouble
		System.out.println("Are we in trouble: "+areWeInTrouble); // we have printed the the result of sreWeInTrouble variable

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {		//created a boolean return type method, at this method we've now created two boolean parameter aSmile & bSmile
		
		boolean result = false; //default boolean value 
		if ((aSmile == true && bSmile == true) || (!aSmile == true && !bSmile == true)) { //we construct our argument by putting both values == to be true or both values equal to be false
			result = true;
		} else {
			result = false; //else the result is false
		}

		return result;

	}

}
/*
 * Method Name: monkeyTrouble • Method Return Type: Boolean • Parameter 1:
 * Boolean aSmile • Parameter 2: Boolean bSmile
 *
 *
 *
 *
 * 
 */
