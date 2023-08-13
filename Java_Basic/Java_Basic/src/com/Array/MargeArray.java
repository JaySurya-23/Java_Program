 package com.Array;

import java.util.Arrays;

public class MargeArray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int a[] = { 11, 22, 22, 44 };
		int b[] = { 11, 2, 3, 4 };

		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int j=0;j<b.length;j++)
		
		{
			c[a.length+j]=b[j];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
