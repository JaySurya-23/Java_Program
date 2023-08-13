 package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
	
		int arr[]= {1,2,3,4,5};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	
		int a[]=new int[6];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		
		System.out.println(Arrays.toString(a));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Array of element print is using toString ");
		System.out.println(Arrays.toString(a));
		System.out.println("*********************\n");
		
		
		System.out.println("Array using for");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
	
		System.out.println("*********************");
		System.out.println("using for each");
		
		for(int x:a)
		{
			System.out.println(x);
		}
	

	}

}
