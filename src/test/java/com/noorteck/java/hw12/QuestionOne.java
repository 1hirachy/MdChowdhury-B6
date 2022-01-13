package com.noorteck.java.hw12;

public class QuestionOne {

	public static void main(String[] args) {
		
		boolean total = posNeg(-1, -10, true);
		System.out.println(total);
				
		
	}
	
	
	
	public static boolean posNeg(int n1, int n2, boolean value) {
		
		boolean result = false;
		if ((n1 < 0 && n2 > 0) && value == false) {
			result = true;
		} else if ((n1 > 0 && n2 < 0) && value == false) {
			result = true;
		}

		return result;

	}
}
