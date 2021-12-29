package com.noorteck.java.hw6;

public class QuestionNumberOne {

	public static void main(String[] args) {
		System.out.println("**************SWITCH STATEMENT***************");

		String colorOption = "blue";
		switch (colorOption) {
		case "red":
			System.out.println("Red Color");
			break;

		case "orange":
			System.out.println("Orange Color");
			break;

		case "black":
			System.out.println("Black Color");
			break;
		default:
			System.out.println("Wrong color, not available");

		}

		System.out.println("*************If ELSE STATEMENT********************");

		String colorOption2 = "blue";

		if (colorOption2 == "red") {
			System.out.println("Red Color");

		} else if (colorOption2 == "orange") {
			System.out.println("Orange Color");

		} else if (colorOption == "black") {
			System.out.println("Black Color");

		} else {
			System.out.println("Wrong color, not available");
		}

	}
}
/**
 * You are given a String variable colorOption. Your task is to display in
 * console: • “Red color” if colorOption is equal to “Red” • “Orange color” if
 * colorOption is equal to “Orange” • “Black color” if colorOption is equal to
 * “Black” • “Wrong color, not available” if colorOption is none of the above
 * 
 * 
 */