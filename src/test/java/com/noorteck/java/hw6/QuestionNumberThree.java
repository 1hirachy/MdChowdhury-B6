package com.noorteck.java.hw6;

public class QuestionNumberThree {

	public static void main(String[] args) {
		System.out.println("*******SWITCH STATEMENT********");

		int n = 15;
		switch (n % 2) {
		case 0:
			System.out.print("Even Number");
			break;

		case 1:
			System.out.println("Odd number");
			break;

		default:
			System.out.println("Unspecified");

		}

		System.out.println("*******IF ELSE STATEMENT********");

		int x = 3;

		if (x % 2 == 0) {
			System.out.println("Even Number");
		} else if (x % 2 == 1) {
			System.out.println("Odd Number");
		} else {
			System.out.println("Unspecified");
		}

	}
}
/**
 * Declare and initialize int number. Check whether the number is EVEN or ODD
 * using
 * 
 */