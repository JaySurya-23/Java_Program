 package com.String;

public class FrequencyAarya {
	
	public static void freq(String str )
	{
		
		
		str=str.toLowerCase();
		
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
			System.out.println(ch[i]+" "+count);
			
		}
		
	}

	public static void main(String[] args) {
		
       String str="Jayjay";
       FrequencyAarya.freq(str);
	}

}
