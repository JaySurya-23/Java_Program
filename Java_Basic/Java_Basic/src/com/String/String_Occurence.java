package com.String;

public class String_Occurence {

	public static void main(String[] args) {
		
		String str="jay";
		
		convet(str);
		
	}	

	private static void convet(String str) {
			char ch=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			 ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
			System.out.println(ch);
		}
		
		}
		
	}
}

