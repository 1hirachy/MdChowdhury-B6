package com.noorteck.java.day22;

public class HomeworkQ5 {

	public static void main(String[] args) {
		String resultOne = removeSpace(null);
		String resultTwo = removeSpace("     Java Training      ");
		String resultThree = removeSpace("   I like to practice	");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
	public static String removeSpace(String strOne) {
		String result = "";
		if(strOne != null) {
			result = strOne.trim();
		}else {
			result = null;
		}
		
		return result;
	}
}
/**
Write a method to trim any leading or trailing whitespace from a given string
Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (null”) ----- null
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice
*/