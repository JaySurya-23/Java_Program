package com.for_loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number");
		
		int base=sc.nextInt();
		
		System.out.println("Enter the exponent number");
		int exp=sc.nextInt();
		
		int pow=1;
		
		for(int i=1;i<=exp;i++)
		{
			pow=pow*base;
		}

		System.out.println("power is = "+pow);
		
	}

}
