package com.Practice;

public class VowelString {

	public static void main(String[] args) {
		String str="I like java";
		
		char ch[]=str.toCharArray();
		char v[]= {'a','e','i','o','u'};
		char v1[]= {'A','E','I','O','U'};
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<v.length;j++)
			{
				if(ch[i]==v[j])
				{
					ch[i]=(char) (ch[i]-32);
				}
				
				else if(ch[i]==v1[j])
				{
					ch[i]=(char) (ch[i]+32);
				}
			}
		}
		System.out.println(ch);

	}

}
