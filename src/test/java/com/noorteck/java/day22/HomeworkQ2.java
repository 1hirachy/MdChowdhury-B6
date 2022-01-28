package com.noorteck.java.day22;

public class HomeworkQ2 {

	public static void main(String[] args) {
		HomeworkQ2 obj = new HomeworkQ2();
		
		boolean resultOne = obj.isEndWith("java training", "ing");
		boolean resultTwo = obj.isEndWith("Java training", "ng");
		boolean resultThree = obj.isEndWith("java training","train");
		boolean resultFour = obj.isEndWith(null, "java");
		boolean resultFive = obj.isEndWith(null, null);
		boolean resultSix = obj.isEndWith("aabc", "abc");
		boolean resultSeven = obj.isEndWith("abc", null);
		
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		System.out.println(resultFive);
		System.out.println(resultSix);
		System.out.println(resultSeven);
		
	}
	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;
		if(strOne != null && strTwo != null) {
			result = strOne.endsWith(strTwo);
		}else {
			result = false;
		}
		
		return result;

	}
}	
/**
Write a method to check whether a given string ends with the contents(Characters) of another string
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isEndWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isEndWith (“java training”, “ing”) ----- TRUE
isEndWith (“java training”, “ng”) ----- TRUE
isEndWith (“java training”, “java”) ----- False
isEndWith (“java training”, “train”) ----- False
isEndWith (null , “java”) ----- False
isEndWith (null , null) ----- False
isEndWith (“aaabc”, “abc”) ----- TRUE
isEndWith (“abc”, null) ----- False
*/