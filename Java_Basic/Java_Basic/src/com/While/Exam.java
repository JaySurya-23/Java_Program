package com.While;

import java.util.Scanner;

public class Exam {
	
	public static boolean findThree(int num)
	{
		boolean isPresent=false;
		while(num>0)
		{
			if(num%10==3)
			{
				return true;
			}
			num=num/10;
			
		}
		return isPresent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Numbers");
		int num=sc.nextInt();
		boolean isPresent=false;
		isPresent=Exam.findThree(num);
		System.out.println(isPresent);
		
		

	}

}
