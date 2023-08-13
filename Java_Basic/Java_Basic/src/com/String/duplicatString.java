package com.String;

public class duplicatString {
	
	public static void dup(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='\0')
				continue;
			count=1;
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			
   //  System.out.println(ch[i]+" "+count);frequency of string
			
			if(count>1)//Duplicate string 
//			if(count==1)//Unique
			{
				System.out.println(ch[i]+" "+count);
			}
		}
		
	}

	public static void main(String[] args) {

		
		
		String str="hellohi";
        duplicatString.dup(str);
	}

}
