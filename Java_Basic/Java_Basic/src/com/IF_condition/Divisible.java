package com.IF_condition;

import java.util.Scanner;

public class Divisible {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter any number ");
		int num=sc.nextInt();
		
		if(num%5==0)
		{
			System.out.println("The Number is divisible by 5 ="+num);
		}
		
		else
		{
			System.out.println(" The Number is not divisible by 5 ="+num);
		}
		
	}

}
