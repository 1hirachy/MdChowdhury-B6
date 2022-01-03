package com.noorteck.java.hw10;

public class QuestionNumberFour {

	public static void main(String[] args) {
		getDoWhileLoopResult(2, 7);
	}

	public static void getDoWhileLoopResult(int minNumber, int maxNumber) {

		do {
			System.out.println(minNumber);
			minNumber++;

		} while

		(minNumber <= maxNumber);

	}
}
/**
 * a.
 * Usingdo-whileloop,loopthroughthenumbersprovidedintheparameter.LoopshouldstartfromminNumandstopatmaxNum.Printeachnumber
 * 
 * Modifier: public static MethodName:getDoWhileLoopResult Method Return Type:
 * voidParam 1= int minNum Param 2=intmaxNum
 */