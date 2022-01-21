package day.noorteck.java.hw19;

public class QuestionFour {

	public static void main(String[] args) {
		QuestionFour obj = new QuestionFour(); // created an obj so we can call toUpper method
		String result = obj.toUpper("Pro"); // initializing result variable and putting the parameter value
		String result2 = obj.toUpper("java");
		String result3 = obj.toUpper("Java Training");

		System.out.println(result); // printing the output
		System.out.println(result2);
		System.out.println(result3);

	}

	String toUpper(String strOne) { // creating a default non-static toUpper method with String parameter
		String result = " ";
		result = strOne.toUpperCase(); // creating logic so whenever we will create a value against our parameter our
										// return value will convert the result with uppercase

		return result;
	}
}
/*
Write a method that takes one String parameter and the method converts the parameter to uppercase and return the new String value
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (“java training”) ----- JAVA TRAINING
 */
