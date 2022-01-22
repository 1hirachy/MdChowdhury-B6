package com.noorteck.java.day20;

public class QuestionTwelve {

	public static void main(String[] args) {
			replaceStr("i cannot do it", "cannot", "can");	 //calling our replaceStr method directly form main method and using our given test data
			replaceStr("Tomorrow is my day", "Tomorrow", "Today");
	}
	//created replaceStr method with given access modifier public, static non-access modifier along with void return type
	//and places three string parameter
	
	public static void replaceStr(String strOne, String oldStr, String newStr) {
		String result; // declared String result variable
		result = strOne.replaceAll(oldStr, newStr); // used result variable to store replace string method where it will change selected string sequence with replacement
		System.out.println(result);
	}
}
/**
Write a method to replace each substring of a given string that matches the given regular expression with the given replacement. The method takes 3 String parameters and replaces oldStr (parameter 2 ) from strOne (parameter1) with newStr(parameter 3) and prints the new value
Access Modifier: public
Non-Access Modifier: static
Return Type: void
Method Name: replaceStr
Parameter1: String strOne
Parameter2: String oldStr
Parameter2: String newStr
Test Data:
replaceStr (“I cannot do it”, “cannot”, “can” ) ----- I can do it
replaceStr (“Tomorrow is my day”, “Tomorrow”, “Today” ) ----- Today is my day
*/