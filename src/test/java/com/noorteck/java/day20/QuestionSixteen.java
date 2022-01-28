package com.noorteck.java.day20;

public class QuestionSixteen {

	public static void main(String[] args) {
		QuestionSixteen obj = new QuestionSixteen();
		
		String result = obj.concatString("Java", "awesome");
		String resultTwo = obj.concatString("java", "training");
		String resultThree = obj.concatString("food", "door");
		String resultFour = obj.concatString("pro", "ogress");
		
		
		System.out.println(result);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
	String concatString(String strOne, String strTwo) {
		String result = "";
		
		int strOneEndsAt = strOne.length()-1;
		//System.out.println(strOneEndsAt);
		String strOneLastChar = strOne.substring(strOneEndsAt);
		//System.out.println(strOneLastChar);
		
		//int strOneIndex = strOne.charAt(strOneEndsAt);
		//int strTwoBeginAt = strTwo.indexOf(0);
		//System.out.println(strTwoBeginAt);
		
	
		String strTwoFirstChar = strTwo.substring(0, 1);
		//System.out.println(strTwoFirstChar);
		
		/**
		 if (strOne.endsWith(strTwoFirstChar)) {
		 
			result = strOne.concat(strTwo.substring(1));
		}else {
			result = strOne.concat(strTwo);
		}
	
		*/
		if(strOneLastChar.equals(strTwoFirstChar)) {
			result = strOne.concat(strTwo.substring(1));
		}else {
			result = strOne.concat(strTwo);
		}
		
		
			return result;
	}
}


/**
Write a method to concatenate two given strings such that, if the concatenation creates a double characters then removes one of the characters.
a. For example strOne = “food”; strTwo =”door”. After concatenating two strings it will give us “fooddoor”(dd is double character, remove one of the d) then the string after concatenation are: “foodoor”
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: concatString
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
concatString (“Java”, “awesome”) ----- javawesome
concatString (“food”, “door”) ----- foodoor
concatString (“java”, “training”) ----- javatraining
concatString (“Pro”, “ogress”) ----- Progress
*/