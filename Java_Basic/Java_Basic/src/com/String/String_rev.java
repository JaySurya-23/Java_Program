package com.String;

public class String_rev {
	
	public static void rev(String str)
	{
		
		String st[]=str.split(" ");
		String rev="";
		
		for(int i=0;i<st.length;i++) 
		{
			for(int j=st[i].length()-1;j>=0;j--)
			{
				rev=rev+st[i].charAt(j);
			}
			
			rev=rev+" ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
     
		 String str="India is my country";
		 System.out.println(str);
		 String_rev.rev(str);


	}

}
