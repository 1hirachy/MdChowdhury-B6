package com.noorteck.java.hw6;

public class QuestionNumberTwo {
	public static void main(String[] args) {

		System.out.println("********SWITCH STATEMENT*********");

		char gender = 'y';
		switch (gender) {
		case 'M':
			System.out.println("Male");
		case 'm':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
		case 'f':
			System.out.println("Female");
			break;

		default:
			System.out.println("Other");
		}

		System.out.println("************IF ELSE***********");

		char gender2 = 'f';

		if (gender2 == 'm' || gender2 == 'M') {
			System.out.println("Male");

		} else if (gender2 == 'f' || gender2 == 'F') {
			System.out.println("Female");

		} else {
			System.out.println("Other");
		}
	}
}
/**
 * Declare and initialize char gender (M, m, F,f) and print the full gender
 * (Female, Male)
 */
