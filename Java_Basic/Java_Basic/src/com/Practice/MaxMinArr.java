package com.Practice;

import java.util.Scanner;

public class MaxMinArr {
	
	public void Maxmin(int arr[])
	{
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
		System.out.println(max+" "+min);
		
	}

	public static void main(String[] args) {
		
		
		int arr[]=new int [4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arrya ele");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
					
		}
		MaxMinArr m=new MaxMinArr();
		m.Maxmin(arr);

	}

}
