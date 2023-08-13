package com.String;

import java.util.Arrays;

public class Occurence_stirng {

	public static void main(String[] args) {
		 String st="core java and advance java";

		 occurence(st);
	}

	private static void occurence(String st) {
		
     	String str[]=st.split(" ");
        String st1="";
//		for(int i=0;i<str.length;i++)
//		{
//			for(int j=0;j>str.length;j++)
//			{
//				if(str[i].equals(str[j]))
//				{
//					str[i]="";
//					str[j]="";
//				}
//			}
//		}
//		System.out.println(Arrays.toString(str));
//	

        
        for(int i=0;i<str.length;i++)
        {
        	if(!(str[i].equals("java")))
        	{
        		st1=st1+str[i]+" ";
        	}
        }
		
		System.out.println(st1);
	}

}
