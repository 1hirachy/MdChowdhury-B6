package com.noorteck.java.day22;

public class HomeworkQ6 {

	public static void main(String[] args) {
		HomeworkQ6 obj = new HomeworkQ6();
		boolean resultOne = obj.endsWithNG(null);
		boolean resultTwo = obj.endsWithNG("I like to practice");
		boolean resultThree = obj.endsWithNG("Everyone is practicing");
		boolean resultFour = obj.endsWithNG("I am studying");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

	
	public boolean endsWithNG(String strOne) {
		
		boolean result = false;
		if(strOne != null && strOne.endsWith("ng")) {
			result = true;
		}else {
			result = false;
		}
	
		
		return result;
	}
}
/**
Write a method that takes a string parameter and return true if the string parameter ends in "ng"
Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
Test Data:
endsWithNG (null) ----- FALSE
endsWithNG (“I like to practice”) ----- FALSE
endsWithNG (“Everyone is practicing”) ----- TRUE
endsWithNG (“I am studying”) ----- TRUE
*/