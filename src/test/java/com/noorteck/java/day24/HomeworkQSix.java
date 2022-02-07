package com.noorteck.java.day24;

public class HomeworkQSix {

	public static void main(String[] args) {
		int [] resultOne = { 6, 3, 5, 2, 5 };
		int [] resultTwo = {13, 2, 3,4, 6, 1, 2, 3};
		int [] resultThree = {3, 3,0, 1, 4, 3 ,6};
		int [] resultFour = {2, 6, 2};
		
		boolean firstResult = checkNum(resultOne);
		boolean secondResult = checkNum(resultTwo);
		boolean thirdResult = checkNum(resultThree);
		boolean fourthResult = checkNum(resultFour);
		
		
		System.out.println(firstResult);
		System.out.println(secondResult);
		System.out.println(thirdResult);
		System.out.println(fourthResult);
	}

	protected static boolean checkNum(int[] num) {
		boolean result = false;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 2 || num[i] == 5) {
				count = count + 1;
			}

			if (count >= 2 || count >=5 )  {
				result = true;
			}
			
		}

		return result;
	}
}

/**
Write a method that takes an array of int parameter and return true if the array
contains value 2 twice, or value 5 twice.
Access Modifier: protected
Non-Access Modifier: static
Return Type: boolean
Method Name: checkNum
Parameter1: int [] number
Test Data:
checkNum ([6, 1, 2, 3]) ----- FALSE
checkNum ([13, 2, 3,4, 6, 1, 2, 3]) ----- TRUE
checkNum ([3, 3,0, 1, 4, 3 ,6]) ----- FALSE
checkNum [2, 6, 2]) ----- TRUE
*/