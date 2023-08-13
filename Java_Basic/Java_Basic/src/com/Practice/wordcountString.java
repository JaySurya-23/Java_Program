package com.Practice;

public class wordcountString {
	
	public static void word(String str)
	{
		
		String sp[]=str.split(" ");
		
		System.out.println(sp.length);
		
		
	}

	public static void main(String[] args) {
		String str="jay suryawanshi";
		wordcountString.word(str);
		
		

	}

}
