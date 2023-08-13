package com.Practice;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				
				System.out.println(arr[i]+" = index position of even number in array :"+i);
			}
		}
		
		System.out.println("Prime number n array");
		
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			for(j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				break;
			}
			
			if(j==arr[i])
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not");
			}
		}

	}

}
