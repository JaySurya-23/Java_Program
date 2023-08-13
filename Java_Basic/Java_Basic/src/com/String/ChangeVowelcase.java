package com.String;

public class ChangeVowelcase {

	public static void main(String[] args) {
		
		String str="I like java programming";

		changcase(str);
	}

	private static void changcase(String str) {
		
		char ch[]=str.toCharArray();
		
		char vow[]= {'a','e','i','o','u'};
		char vowel[]= {'A','E','I','O','U'};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<vow.length;j++)
			{
				if(ch[i]==vow[j])
				{
					ch[i]= (char) (ch[i]-32);
				}
				
				else if(ch[i]==vowel[j]) {
					ch[i]= (char) (ch[i]+32);
				}
				
				
				
			}
			System.out.print(ch[i]);
		}
		
	}

}
