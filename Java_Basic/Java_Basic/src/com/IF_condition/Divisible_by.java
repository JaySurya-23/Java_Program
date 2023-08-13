package com.IF_condition;

import java.util.Scanner;

// check number divisible by 5 or 11
public class Divisible_by {

	public static void main(String[] args) {

		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 5== 0 && num % 11 == 0) {
			System.out.println(num + " The number is Divible by  5 or 11");
		} else {
			System.out.println(num + " The number is NOT Divible by  5 or 11");
		}
	}
}
