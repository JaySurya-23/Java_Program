package com.Array;

import java.util.Arrays;

public class Array_duplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3};
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
			if(count>1) {
			System.out.println(arr[i]+" "+count);
			}
		}
	
		
	}

}
