package com.While;

import java.util.Scanner;

public class Sum_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,sum=0;
		
		while(num>0)
		{ 
			rem=num%10;
			if(rem%2==0)
			{
			
			sum=sum+rem;
			
			}
			num=num/10;
		}
		System.out.println(sum);
	}

}
