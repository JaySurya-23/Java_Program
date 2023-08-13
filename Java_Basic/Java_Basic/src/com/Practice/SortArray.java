package com.Practice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch[]= {3,5,6,2,1};
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
        System.out.println(Arrays.toString(ch));
	}

}
