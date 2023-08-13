package com.Practice;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arrya element");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++)
		{
			sum=sum+arr[j];
		}
  
		System.out.println(sum);
	}

}
