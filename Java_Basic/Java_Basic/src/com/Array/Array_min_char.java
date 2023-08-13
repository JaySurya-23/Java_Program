package com.Array;

import java.util.Arrays;

public class Array_min_char {

	public static void main(String[] args) {
		
		char arr[] = {'A','D', 'E', 'x', 'z', 'R'};
		
		char min = 'A';
		
		for(int i=0;i<arr.length;i++)
		{
					
				if(min>=arr[i])
				{
					min=arr[i];
				}	
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(min);
	}
}
