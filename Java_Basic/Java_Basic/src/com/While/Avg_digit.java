package com.While;

import java.util.Scanner;

public class Avg_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int sum=0,count=0;
		
			while(num>0)
			{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			count++;
			
		}
			int avg=sum/count;
			System.out.println(avg);
		}
		
	   
	}


