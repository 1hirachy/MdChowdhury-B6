package day.noorteck.java.hw19;

public class QuestionNine {
	public static void main(String[] args) {
		
		QuestionNine obj = new QuestionNine();
		
		boolean resultOne = obj.isThere("java training", "ini");
		boolean resultTwo = obj.isThere("java training", "ava");
		boolean resultThree = obj.isThere("java", "INI");
		boolean resultFour  = obj.isThere("java training", "Java");
		
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
	private boolean isThere(String strOne, String value) {
		boolean result = false;
		
		if(strOne.contains(value)) {
			result = true;
		}
		
		return result;
	}
}
/**
Write a method that takes two String parameters and the method checks if a given String contains the specified sequence of character values. Return true if it contains the value otherwise false
Access Modifier: private
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isThere
Parameter1: String strOne
Parameter2: String value
Test Data:
isThere (“java training”, “ini”) ----- TRUE
isThere (“java training”, “ava”) ----- TRUE
isThere (“java training”, “AVA”) ----- False
isThere (“java training”, “Java”) ----- False
*/
