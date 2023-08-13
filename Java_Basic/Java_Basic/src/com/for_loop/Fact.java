package com.for_loop;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int fact = 1, i;

		for (i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

}
