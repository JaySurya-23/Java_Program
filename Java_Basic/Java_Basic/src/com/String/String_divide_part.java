package com.String;

import java.util.Arrays;

public class String_divide_part {
	
	public static void dividepart(String str,int num)
	{
		int len=str.length();
		
		int n=len/num;
		
		if(len%n==0)
		{
			String spl[]=new String[n];
			int index=0;
			
			for(int i=0;i<len;i+=num)
			{
				spl[index]=str.substring(i, i+num);
				index++;
			}
			System.out.println(Arrays.toString(spl));
		}
		
	}
	

	public static void main(String[] args) {
		
		String str="Jay Suryawanshi";

		int numofchar=2;
		dividepart(str, numofchar);
	}

}
