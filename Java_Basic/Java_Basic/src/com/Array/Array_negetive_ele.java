package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_negetive_ele {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter element");

		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		int i;
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				
			count++;
			System.out.println(arr[i]);
			}
		}
		
	}

}
