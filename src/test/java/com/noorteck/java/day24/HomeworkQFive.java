package com.noorteck.java.day24;

public class HomeworkQFive {
	public static void main(String[] args) {
		int [] testDataOne = {6, 1, 2, 2};
		int [] testDataTwo = {13, 3};
		
		HomeworkQFive obj = new HomeworkQFive();
		
		int [] result = obj.getDouble(testDataOne);
	
	//	System.out.println("["+ result + "]");
		
		obj.getDouble(testDataTwo);
	}
	private int [] getDouble(int [] number) {
	
		int [] result = new int [(number.length)*2 ];
		//System.out.println(result.length);
		
	//	for(int i = 0; i < result.length-1; i++) {
		
	//	System.out.println(result[i]);
	//	}
		//int lastElement = result[result.length-1];
		//System.out.println(lastElement);
		
		int lastElement2 = number[number.length -1];
		System.out.println(lastElement2);
		//if(lastElement == result[number.length-1]) {
			
		//}
		//System.out.println(lastElement);
				
		return result;
	}

}
/**
Write a method that takes an array of int parameter and return a new array with double
the size/length, where its last element value is the same as the original array last
element, and all the other element values are 0.
Access Modifier: private
Non-Access Modifier: non-static
Return Type: int []
Method Name: getDouble
Parameter1: int [] number
Test Data:
getDouble ([6, 1, 2, 3]) ----- [0,0,0,0,0,0,0,3]
getDouble ([13, 3]) ----- [0,0,0, 3]
getDouble ([0, 1, 4]) ----- [0,0,0,0,0,4]
getDouble ([ 6]) ----- [0,6]
*/