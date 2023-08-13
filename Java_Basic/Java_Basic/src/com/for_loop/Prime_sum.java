package com.for_loop;

import java.util.Scanner;

public class Prime_sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i,j;
		int sum=0;
		int temp=0;
		
		for(j=1;j<=10;j++)
		{
			int count=0;
		
		for( i=2;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;
				break;	
			}
						
		}
		if(count==0 )
			temp++;
			sum=sum+j;	
	}
		System.out.println(sum);
	}

}
