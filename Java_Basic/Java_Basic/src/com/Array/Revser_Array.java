package com.Array;

import java.util.Arrays;

public class Revser_Array {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=arr.length-1;j>=0;j--)
			
			{ 
				 System.out.print(arr[j]+" ");
			}
			
		}	
		
	}

}
