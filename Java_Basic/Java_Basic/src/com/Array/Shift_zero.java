package com.Array;

import java.util.Arrays;

public class Shift_zero {

	public static void shift(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int arr[] = { -12, 0, -3, 4, 5, 0, 9 };
		shift(arr);
	}

}
