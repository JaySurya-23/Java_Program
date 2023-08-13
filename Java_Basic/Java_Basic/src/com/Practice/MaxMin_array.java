package com.Practice;

import java.util.Scanner;

public class MaxMin_array {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element");
		
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		   else if(min>arr[i])
			{
				min=arr[i];
			}
		}
       
		System.out.println(max+"  max number ");
		System.out.println(min+" min number");
	}

}
