package com.Practice;

import java.util.Arrays;

public class Left_rotate {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<2;i++)
		{
			int f=a[0];	
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			
			a[a.length-1]=f;
		}	
			System.out.println(Arrays.toString(a));
		
			

	}

}
