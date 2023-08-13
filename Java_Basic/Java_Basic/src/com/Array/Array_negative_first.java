package com.Array;

import java.util.Arrays;

public class Array_negative_first {

	public static void main(String[] args) {
		
		int arr[]= {12, 3,-19, 29, 5, -61, 44, 7, -9};
		
		for(int i=0;i<arr.length;i++)

		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>=0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
