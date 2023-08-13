package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeToggel_Array {

	public static void main(String[] args) {
		
		char ch[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  arrya element ");
		
		for(int j=0;j<ch.length;j++)
		{
			ch[j]=sc.next().charAt(0);
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				ch[i]= (char) (ch[i]+32);	
			}
			
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char) (ch[i]-32);
			}
			
			else
			{
				ch[i]=ch[i];
			}
		}
		
		System.out.println(Arrays.toString(ch));
		
		

	}

}
