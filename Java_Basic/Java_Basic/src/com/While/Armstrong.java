package com.While;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int temp,rem,sum=0;
		
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Amrstrong");
		}
		
		else
		{
			System.out.println("not amrstrong");
		}
	}

}
