package com.Practice;

public class StringRev {
	
	public  static void rev(String str)
	{
		String st[]=str.split("\\s"); // \\s for white space
        
		String rev=" ";
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=st[i].length()-1;j>=0;j--)
			{
				rev+=st[i].charAt(j);
			}
			
			rev=rev+" ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		String str="jay";
		StringRev.rev(str);

	}

}
