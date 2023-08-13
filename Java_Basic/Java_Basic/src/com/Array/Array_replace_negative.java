package com.Array;

import java.util.Arrays;

public class Array_replace_negative {

	public static void main(String[] args) {
		
		int arr[]= {12, 3,-19, 29, 5, -61, 44, 7, -9};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0]<0)
			{
				arr[0]=arr[arr.length-1]*arr[arr.length-1];
			}
			
			
			if(arr[i]<0 && i!=0)
			{
				arr[i]=arr[i-1]*arr[i-1];
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
