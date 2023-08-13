package com.Practice;

public class StringSpaceCount {

	
	public static void space(String str)
	{
		char ch[]=str.toCharArray();
		
		int count=1;
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		
		String str="Hello jay Hi";
		StringSpaceCount.space(str);
	}

}
