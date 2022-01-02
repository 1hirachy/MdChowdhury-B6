package com.noorteck.java.hw10;

public class QuestionNumberOne {

	public static void main(String[] args) {
		calculateMethod(4.00, 3.99, '*');
		calculateMethod(3.99, 4.69, '&');
	}

	public static void calculateMethod(double numOne, double numTwo, char mathOperationSign) {

		switch (mathOperationSign) { // used char variable to create switch statement
		case '+':
			System.out.println(numOne + numTwo);
			break;
		case '-':
			System.out.println(numOne - numTwo);
			break;
		case '/':
			System.out.println(numOne / numTwo);
			break;
		case '*':
			System.out.println("4.00 * 3.99 = " + numOne * numTwo);
			break;
		default:
			System.out.println("Error Message");
		}

	}

}
/**
 * 1. Writeamethodthattakes3parameters(2 doublevalueand1
 * charvalue).Themethodshouldperformcalculation(addition,subtraction,multiplication,divisionandmodulus).
 * a. DependingthemathoperationmathOperationSigncharacter(+,
 * -./,*,%)passedtothemethoditshouldperformappropriatecalculationandshouldprinttheresultofoperation
 * b. IfuserentersinvalidmathoperationmathOperationSign,
 * thenitshouldprinterrormessage. Method Name: calculateMethod Return Type:
 * voidParameter 1 = double numOneParameter2=doublenumTwo
 * Parameter2=charmathOperationmathOperationSign
 * 
 * Example:
 * 
 * Ifyoupass(2.0,4.0,‘+’)inyourmethod
 * 
 * calculate(2.0,4.0,‘+’);Consoleoutputshouldbe2.0+4.0=6.0
 */
