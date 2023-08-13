package com.for_loop;

import java.util.Scanner;

public class Prime_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int temp=0;
		int sum=0;
		for(int num=1;num<=10;num++) 
		{
			int count=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0) 
				{
					count++;
					break;
				}
			}
			if(count==0 && num!=1) {
				//temp++;
				sum=sum+num;
				}
					
			}
		//double average=sum/temp;
		System.out.println("sum of prime number is: "+sum);
	

	}

}
