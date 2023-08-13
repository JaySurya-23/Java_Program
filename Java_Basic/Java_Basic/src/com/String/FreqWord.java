package com.String;

public class FreqWord {
	
	public static void freqword(String st)
	{
		st=st.toLowerCase();
		
		String[] str=st.split(" ");
		int count;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("Visited"))
				continue;
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="Visited";
				}
				
			}
			
			System.out.println(str[i]+" "+count);
		}
	}

	public static void main(String[] args) {

       String st="Java is easy and Java is hard";
       
       FreqWord.freqword(st);
	}

}
