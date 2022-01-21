package day.noorteck.java.hw19;

public class QuestionSeven {
	
	//created default access modifier and non access modifier 
	//with String return type method called helloTO with string parameter
	String helloTo(String strOne) {
		String result = ""; //set up the default String value
		String s1 = "Hello"; //created additional String variable and initialized it with value Hello
		
		result = s1 + " " +strOne; //updated result value with combining s1 and strOne
		
		return result;
	}
	
	public static void main(String[] args) {
		 
			QuestionSeven obj = new QuestionSeven(); //created object to call helloTo method
			
			String result  = obj.helloTo("Denis"); //initialized String result variable with helloTo method
			String result2 = obj.helloTo("Malek"); // and placed given parameter value
			String result3 = obj.helloTo("Sara");
			
			System.out.println(result); //printing the test data 
			System.out.println(result2);
			System.out.println(result3);
			
	}
}
/**
Write a method that takes one String parameter (name) and the method returns new String value appending “Hello” to name parameter
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: helloTo
Parameter1: String strOne
Test Data:
helloTo (“Denis”) ----- Hello Denis
helloTo (“Malek”) ----- Hello Malek
helloTo (“Sara”) ----- Hello Sara
*/