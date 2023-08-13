package com.for_loop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			break;
			
		}
		
		if(i==num)
		{
		System.out.println(" Number is prime");	
		}
		else
		{
		System.out.println("Number is not prime");
		}
	}

}
