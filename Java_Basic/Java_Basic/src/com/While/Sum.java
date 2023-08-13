package com.While;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// First and las t digit sum

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int lastDigit = num % 10;
		while (num >= 10) {
			num /= 10;
		}
		int firstDigit = num;
		int sum = firstDigit + lastDigit;
		System.out.println("Sum of first and last digit: " + sum);
	}

}
