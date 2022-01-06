package com.noorteck.java.hw11;

public class DoubleTotal {
	public static int sumDouble(int value1, int value2) {
		int result = 0;
		if (value1 == value2) {
			result = (value1 * value2);
		} else {
			result = (value1 + value2);
		}
		return result;
	}

	public static void main(String[] args) {
		
		int myTotal = sumDouble(3, 4);
		System.out.println(myTotal);
	}
}
