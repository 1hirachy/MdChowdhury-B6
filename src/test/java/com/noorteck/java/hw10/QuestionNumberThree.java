package com.noorteck.java.hw10;

public class QuestionNumberThree {

	public static void main(String[] args) {
		oddEvenMethod(1);
	}
	public static void oddEvenMethod(int number) {
		if(number % 2 == 0) {
			System.out.println(number + " is an Even Number");
		}else {
			System.out.println(number + " is an Odd Number");
		}
	} 
}
/**
3.	Writeamethodthat takes1parameter.Inthemethodwritethefollowinglogic.
a.	Iftheparameteriseven, thenprintthe numberisanevennumber
b.	Iftheparameterisodd, thenprintthe numberisanoddnumber

Modifier: public static
Method Name: oddEvenMethod Return Type:void
Parameter1=intnumber
*/