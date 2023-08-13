package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrya {
	
	public static void sort(int  a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])    //descending 
			//	if(a[i]>a[j])   //ascending 
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ele");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		SortArrya.sort(a);
	}

}
