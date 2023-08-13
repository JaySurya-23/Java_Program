package com.Practice;

public class String_part {
	
	public static void part(String s, int n)
	{
		int len=s.length();
		int p=len/n;
		for(int i=0;i<s.length();i++)
		{
			if(i%p==0)
			{
			  System.out.println();
			}
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
	String s="aaaabbbbcccc";
	int n=4;
	
    String_part.part(s,n);
	}

}
