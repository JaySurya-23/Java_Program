package com.String;

public class NOofdigit_inString {
	
	
	public static void digit(String str)
	{
		
	     int digit=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) <'0'|| str.charAt(i)>'9')
			{
				digit++;
			}
		}
		System.out.println(digit);
		
	}

	public static void main(String[] args) {
	String str="jay123";
	 NOofdigit_inString.digit(str);
	

	}

}
