package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
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
