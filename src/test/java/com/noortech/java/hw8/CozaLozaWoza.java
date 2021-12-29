package com.noortech.java.hw8;

public class CozaLozaWoza {

	public static void main(String[] args) {
		// For loop

		for (int n = 1; n <= 36; n++) {

			if  (n % 3 == 0 && n % 5 == 0) {
				System.out.println("CozaLoza");
			} else if (n % 5 == 0) {
				System.out.println("Loza");
			} else if (n % 7 == 0) {
				System.out.println("Woza");
			} else if(n % 3 == 0) {
				System.out.println("Coza");
			} else

				System.out.println(n);

		}
	}
}
