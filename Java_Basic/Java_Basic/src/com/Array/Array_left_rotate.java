package com.Array;

import java.util.Arrays;

public class Array_left_rotate {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,8,9};
		
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
