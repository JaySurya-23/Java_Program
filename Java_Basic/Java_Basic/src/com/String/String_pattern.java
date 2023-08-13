package com.String;

public class String_pattern {
	
private static void pattern(String str) {
		
		String st[]=str.split(" ");
		
	
		for(int i=0;i<st.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(st[j]+" ");
			}
			System.out.println();
		}
		
		
	}


	public static void main(String[] args) {
		 
		String str="India is my country";
		String_pattern.pattern(str);

	}

	
}
