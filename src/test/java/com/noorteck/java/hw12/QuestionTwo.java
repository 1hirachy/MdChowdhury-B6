package com.noorteck.java.hw12;

public class QuestionTwo {

	public static void main(String[] args) {
		boolean nonNeg = multipleOf(25);
		System.out.println(nonNeg);
	}
	public static boolean multipleOf(int num) {
		
		boolean result = false;
		if(num > 0 &&( num % 3 == 0 || num % 5 == 0)) {
			result = true;
		}else{
			result = false;
		}
		
		
		
		return result;
		
		
	}
}
