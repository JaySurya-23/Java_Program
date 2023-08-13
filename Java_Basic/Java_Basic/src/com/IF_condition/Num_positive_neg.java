package com.IF_condition;

import java.util.Scanner;

// cheack code numeber positive or negative
public class Num_positive_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(" The number is Positive = " + num);
		}

		else {
			System.out.println(" The number is Negative = " + num);
		}
	}

}
