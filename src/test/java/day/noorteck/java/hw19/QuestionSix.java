package day.noorteck.java.hw19;

public class QuestionSix {

	public static void main(String[] args) {
		String result = combineStr("day", "ONE", "work", "HOURS"); // created String result variable to call combineStr
																	// method
		String result2 = combineStr("week", "weekend", "monday", "Tuesday"); // and placed test variable data
		String result3 = combineStr("reston", "vA", "baltiMore", "MD");
		String result4 = combineStr("java", "is", "fun", "LEARNING");

		System.out.println(result); // print the value of result variable with the given test data
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

	// created protected access type and static non access type modifier with String
	// return type method named combineStr with four string parameter
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result = " ";
		
		//created result variable with the logic of converting parameter according to test data and then used "+"
		//to concatenates four parameter
		result = strOne.toUpperCase() + strTwo.toLowerCase() + strThree.toUpperCase() + strFour.toLowerCase();

		return result;
	}
}
/**
 *Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase,
b. converts parameter 2 and parameter 4 to lower case
c. Then the method concatenates all four parameters and return the new String value.
Access Modifier: protected
Non-Access Modifier: static
Return Type: String
Method Name: combineStr
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Parameter3: String strFour
Test Data:
combineStr (“day”, “ONE”, “work”,”HOURS”) ----- DAYoneWORKhours
combineStr (“week”, “weekend”, “monday”,”Tuesday”) - WEEKweekendMONDAYtuesday
combineStr (“restoN”, “vA”, “baltiMORE”, “MD”) ----- RESTONvaBALTIMOREmd
combineStr (“java”, “is”, “fun”,”LEARNING”) --- JAVAisFUNlearning
*/