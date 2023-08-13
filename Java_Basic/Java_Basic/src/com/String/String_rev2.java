package com.String;

public class String_rev2 {
	
	public static void revs(String str)
	{
		
		String s[]=str.split(" ");
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=s[i].length()-1;j>=0;j--)
			{
				
				rev+=s[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
		
		
		
	}

	public static void main(String[] args) {
		
      String str="I like to learn java";
      revs(str);
	}

}
