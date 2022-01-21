package day.noorteck.java.hw19;

public class QuestionFive {

	public static void main(String[] args) {
		QuestionFive obj = new QuestionFive();

		String result = obj.toLower("espn");
		String result2 = obj.toLower("SOCCER");
		String result3 = obj.toLower("STRING CLASS");

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

	protected String toLower(String strOne) { // creating protected access modifier with String return type toLower
												// method with one String parameter
		String result = "";

		result = strOne.toLowerCase(); // creating logic so when we replace our parameter value, it will convert the
										// given value to lower case

		return result;
	}
}
/**
Write a method that takes one String parameter and the method converts the parameter to lowercase and return the new String value
Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
Test Data:
toLower (“espn”) ----- espn
toLower (“SOCCER”) ----- soccer
toLower (“STRING CLASS”) ----- string class
*/ 