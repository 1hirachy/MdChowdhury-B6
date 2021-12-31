package com.noortech.java.hw8;

public class CozaLozaWozaPart2 {

	public static void main(String[] args) {
		int n = 1;
		while(n <= 36) {
			
			if(n % 3 == 0 && n % 5 ==0) {
			System.out.println("CozaLoza");
		
			}else if(n % 3 == 0) {
				System.out.println("Coza");
			
			}else if(n % 5 ==0) {
				System.out.println("Loza");
			
			}else if(n % 7 == 0) {
				System.out.println("Woza");
			
			}else {
				System.out.println(n);
			}
			n++;
			
		}
	}
}
/**
1.	WriteaprogramcalledCozaLozaWoza(className)whichprintsthenumbers1to36
a.	The program shall print "Coza" in place of the numbers which are multiplesof3 ONLY,(I % 3 ==0)
b.	"Loza"formultiplesof5 ONLY,(I%5 ==0)
c.	"Woza"formultiplesof 7ONLY,(I %7==0)
d.	"CozaLoza"formultiplesof3and5
e.	If the number is not divisible of the above condition, then print the numberitself





*/