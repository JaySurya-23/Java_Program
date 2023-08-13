package com.String;

public class Sum_inString_digit {
	
	public static void sum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		String str="jay23";
		Sum_inString_digit.sum(str);
	}

}
