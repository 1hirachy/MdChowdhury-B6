package com.noorteck.java.day20;

public class QuestionThirteen {

	public static void main(String[] args) {
		QuestionThirteen obj = new QuestionThirteen();
		
		boolean resultOne = obj.isStartWith("java training", "ing");
		boolean resultTwo = obj.isStartWith("java training", "ja");
		boolean resultThree = obj.isStartWith("java training", "java");
		boolean resultFour = obj.isStartWith("java training", "train");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
				
	}
	boolean isStartWith(String strOne, String strTwo) {
		boolean result = false;
		result = strOne.startsWith(strTwo);
		
		return result;
	}
}
/**
Write a method to check whether a given string starts with the contents(Characters) of another string
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isStartWith (“java training”, “ing”) ----- False
isStartWith (“java training”, “ja”) ----- TRUE
isStartWith (“java training”, “java”) ----- TRUE
isStartWith (“java training”, “train”) ----- False
*/