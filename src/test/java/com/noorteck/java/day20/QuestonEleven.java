package com.noorteck.java.day20;

public class QuestonEleven {

	public static void main(String[] args) {
		QuestonEleven obj = new QuestonEleven(); //created an object so we can call our non-static method threeEqual from our main method 
		
		String resultOne = obj.threeEqual("Java Pro", 'P', 'B'); //creating resultOne memoryBox to store given parameter values of threeEqual method
		String resultTwo = obj.threeEqual("Lazy mode", 'm', 'C');
		String resultThree = obj.threeEqual("Training", 'T', ' ');
		
		System.out.println(resultOne); //printing the resultOne where we stored threeEqual method with test parameter value
		System.out.println(resultTwo); //same as above
		System.out.println(resultThree);
		
	}
	
	//created a protected access type String return type method with three given parameter
	protected String threeEqual(String str, char oldchar, char newChar) {
		String result = "";  //placed default String value in result
		result = str.replace(oldchar, newChar); // used replace method to replace character to new character
		
		
		
		return result;
	}
}
/**
Write a method that takes three parameters. One String parameter, 2 character parameters.
The method replaces old character (parameter 2) from String parameter with new character (parameter 3) and returns the new string
Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
Test Data:
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining
*/