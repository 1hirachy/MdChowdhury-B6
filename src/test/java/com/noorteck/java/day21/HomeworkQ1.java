package com.noorteck.java.day21;

public class HomeworkQ1 {

	public static void main(String[] args) { //created main method
		HomeworkQ1 obj = new HomeworkQ1();  //created a new object to call non-static toUpper method
		
		String resultOne = obj.toUpper("Pro"); //calling toUpper method and placed test value
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper(null);
		
		System.out.println(resultOne); //printing the test value result  to console
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
	String toUpper(String strOne) { //created a default non-static toUpper method with String return type
		
		String result = ""; 		//initialized default String result value
		if(strOne != null) { 		// created if statement and placed argument to ensure if strOne variable value is not null then it will change the value to Uppercase
			result = strOne.toUpperCase();
		}else {						//otherwise our else statement will print null value
			result = null; 
		}
		
		return result; // it will return the result value of toUpper method
		
	}
}
/**
Write a method that takes one String parameter and the method converts the parameter to uppercase and return the new String value
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (null) ----- null
*/