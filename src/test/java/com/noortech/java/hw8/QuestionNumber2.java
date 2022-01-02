package com.noortech.java.hw8;

public class QuestionNumber2 {
	public static void main(String[] args) {

		for (int windspeed = 20; windspeed <= 200; windspeed++) {

			if (windspeed >= 74 && windspeed <= 95) {
				System.out.println(windspeed + " : Catagory 1");

			} else if (windspeed >= 105 && windspeed <= 110) {
				System.out.println(windspeed + " : Catagory 2");
			} else if (windspeed >= 120 && windspeed <= 130) {
				System.out.println(windspeed + " : Catagory 3");
			} else if (windspeed >= 140 && windspeed <= 155) {
				System.out.println(windspeed + " : Catagory 4");
			} else if (windspeed >= 165 && windspeed <= 194) {
				System.out.println(windspeed + " : Catagory 5");
			} else {
				System.out.println(windspeed + ": No Hurricane");
			}
		}
	}
}
