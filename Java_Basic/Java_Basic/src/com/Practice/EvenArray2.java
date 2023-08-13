package com.Practice;

import java.util.Arrays;

public class EvenArray2 {

	public static void evenodd(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] % 2 == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		//asc(arr);
	}

	public static void asc(int arr[]) {
		int position = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2!= 0)
			{
				position = i;
				break;
			}
		}

		for (int i = 0; i < position; i++) {

			for (int j = i + 1; j < position; j++)
			{
				if (arr[i] > arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = position; i < arr.length; i++)
		{
			
			for (int j = i + 1; j < arr.length; j++) 
			{
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

		int arr[] = { 7, 9, 6, 2, 5, 3, 8, 4 };
		evenodd(arr);
		asc(arr);

	}

}
