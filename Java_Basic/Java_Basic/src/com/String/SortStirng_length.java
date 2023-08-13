package com.String;

import java.util.Arrays;

public class SortStirng_length {
	
	public static void sort(String[] str)
	{
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if( str[i].length()>str[j].length())
				{
					String  temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		
		
		String str[]= {"Java","C","C++","Angular","HTML"};
		SortStirng_length.sort(str);

	}

}
