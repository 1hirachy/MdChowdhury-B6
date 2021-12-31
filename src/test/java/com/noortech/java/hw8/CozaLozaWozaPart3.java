package com.noortech.java.hw8;

public class CozaLozaWozaPart3 {
	public static void main(String[] args) {

		int n = 1;
		do {
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.println("CozaLoza");

			} else if (n % 3 == 0) {
				System.out.println("Coza");

			} else if (n % 5 == 0) {
				System.out.println("Loza");

			} else if (n % 7 == 0) {
				System.out.println("Woza");

			} else {
				System.out.println(n);
			}
			n++;
		} while (n <= 36);
	}
}
