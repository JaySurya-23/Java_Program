package com.Array;

import java.util.Arrays;

public class Array_right_roate {
	
	public static void left(int a[])
	{
		System.out.println(Arrays.toString(a));
		for(int i=0;i<2;i++)
		{
			int first=a[0];
							
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			
			a[a.length-1]=first;
		}
		System.out.println("........LeftRotate.................");
		System.out.println(Arrays.toString(a));
		System.out.println("........RightRotate................");
	}
       
	public static void right(int a[])
	{
		for(int i=0;i<2;i++)
		{
			int last=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		left(a);
		right(a);
		
	}
}
