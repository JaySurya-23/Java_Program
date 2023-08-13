package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MargeArray {

	public static void main(String[] args) {

		int arr[] = new int[4];
		int ar[] = new int[2];

		int c[] = new int[arr.length + ar.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter 2nd array element");
		for (int j = 0; j < ar.length; j++) {
			ar[j] = sc.nextInt();
		}

		System.out.println("........................");
		for (int i = 0; i < arr.length; i++) {
			c[i] = arr[i];
		}

		for (int j = 0; j < ar.length; j++) {
			c[arr.length + j] = ar[j];
		}

		System.out.println(Arrays.toString(c));
	}

}
