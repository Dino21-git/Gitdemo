package org.metho;

import java.util.Scanner;

public class tern {

	public static void main(String[] args) {
		Scanner D = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int m = D.nextInt();
		String result = (m % 4 == 0 && (m % 100 != 0 || m % 400 == 0)) ? "Leap Year" : "Not a Leap Year";;
		System.out.println("Result is: " + result);
	
	}

}
