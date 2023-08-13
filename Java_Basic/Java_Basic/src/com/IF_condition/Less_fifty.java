package com.IF_condition;
// check code is number is less than 50
import java.util.Scanner;

public class Less_fifty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<=50)
		{
			System.out.println(num+" NUmber is less than 50 ");
		}
		
		else
		{
			System.out.println(num+" Number is High ");
		}

	}

}
