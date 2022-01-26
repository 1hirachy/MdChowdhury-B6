package com.noorteck.java.day20;

public class QuestionEight {

	public static void main(String[] args) {
		char result = getCharacter("java training", 22);
		
		System.out.println(result);
	}
	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';
		
		if(strOne.length()<= indexNum) {
			result = '?';
		}else {
			result = (strOne.charAt(indexNum));
		
		}
		
		return result;
	}
	
}
/**
Write a method that takes two parameters, one String parameter and one integer parameter. 
The method should return the character at the given index within the String. If the indexNum more than the length of String then return ‘?’ mark
Access Modifier: public
Non-Access Modifier: static
Return Type: char
Method Name: getCharacter
Parameter1: String strOne
Parameter2: Int indexNum
Test Data:
getCharacter (“java training”, 2) ----- v
getCharacter (“java training”, 5) ----- t
getCharacter (“java training”, 8) ----- i
getCharacter (“java training”, 22) ----- ?
*/