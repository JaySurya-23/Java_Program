package com.While;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int sum=0,product=1,rem;
		
		while(num>0)
		{
			rem=num%10;
			
			sum=sum+rem;
			product=product*rem;
			
			num=num/10;
		}
		
		if(sum==product)
		{
			System.out.println("number is SPY  ");
		}
		
		else
		{
			System.out.println("number is not spy ");
		}

	}

}
