package com.Array;

import java.util.Scanner;

public class AlternateArray {

	public void Alternate(int arr[]) {
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element of array");

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("..........................");
		System.out.println("Alternate Array of Element");
		AlternateArray A = new AlternateArray();
		A.Alternate(arr);

	}

}
