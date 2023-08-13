package com.While;

import java.util.Scanner;

public class Avg_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem, sum = 0, avg, count = 0;

		while (num > 0) {
			rem = num % 10;
			if (num % 2 != 0) {

				sum = sum + rem;
				count++;

			}
			num /= 10;

		}
		avg = sum / count;
		System.out.println(avg);

	}

}
