package com.noortech.java.hw8;

public class QuestionNumber5 {
	public static void main(String[] args) {
		
		for (int number = 1; number <= 32; number++) {
			if (number % 2 == 0 && number >= 2 && number <= 5) {
				System.out.println("Even numbers between 2-5 are: " + number);
			} else if (number % 2 == 0 && number >= 6 && number <= 20) {
				System.out.println("Even numbers between 6-20 are: " + number);
			} else if (number % 2 == 1 && number >= 15 && number <= 20) {
				System.out.println("Odd numbers between 15-20 are: " + number);
			}
		}
	}
}
