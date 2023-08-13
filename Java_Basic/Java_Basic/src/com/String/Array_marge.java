package com.String;

import java.util.Arrays;

public class Array_marge {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8,9};
		
		int arr3[] =new int[arr.length + arr1.length];
				
		for(int i=0;i<arr.length;i++)
		{
			arr3[i]=arr[i];
		
		for(int j=0;j<arr1.length;j++)
		{
			arr3[arr.length+j]=arr1[j];
		}
		
		}
		System.out.println(Arrays.toString(arr3));
	}

}
