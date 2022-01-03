package com.noorteck.java.hw10;

public class QuestionNumberTwo {
	public static void main(String[] args) {

		getGenderMethod('m');

	}

	public static void getGenderMethod(char gender) {
		switch (gender) {
		case 'm':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Error Message");
		}
	}
}
/**
 * 2. Write a method that takes 1 char parameter. The method should print the
 * full gender (Female,Male)basedonthecharacterpassed.
 * Ifuserentersinvalidgendercharacter,thenitshouldprinterrormessage
 * 
 * Modifier: public static Method Name: getGenderMethod Return Type:
 * voidParameter1=chargender
 */