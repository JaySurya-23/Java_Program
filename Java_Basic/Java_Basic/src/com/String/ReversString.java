package com.String;

public class ReversString {
	
	public static void rev(String str)
	{
		
		String st[]=str.split("\\s");
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
	
		
		String str="india is best country";
		
		System.out.println(str);
		
		ReversString.rev(str);

	}

}
