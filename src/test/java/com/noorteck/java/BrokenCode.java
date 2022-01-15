package com.noorteck.java;

public class BrokenCode {
	public static void main(String[] args) {

		int addResult = addTwoNumbers(2, 4); // updated according to method parameter type

		// System.out.println(addResult);

		for (int i = 0; i <= 10; i++) {
			System.out.println("Count = " + i);// updated the syntax for ForLoop
		}

		whoseFavNumber(23);

		whoseFavNumber(3);

		whoseFavNumber(1);

		 myName("John Cena"); // is not making any sense
	}

	public static String myName(String name) {
		String result ="";
		System.out.println("My name is " + name);
		return result;
	}

	public static int addTwoNumbers(int numOne, int numTwo) { // update the return type & also removed unnecessary
																// semicolon

		int result = numOne + numTwo;

		System.out.println(numOne + " + " + numTwo + " = " + result);

		return result;
	}

	public static void whoseFavNumber(int i) {
		String result;

		if (i == 1) {
			result = "Brook";
		} else if (i == 2 || i == 4 && i == 4) { // updated logic
			result = "Dannia";
		} else if (i == 3) { // updated spelling else & put proper logic
			result = "Helen";
		} else { // removed unnecessary double parenthesis & added curley braces
			result = "my favorite number";
		}

		System.out.println(result);
	}
}
