package com.IF_condition;
// check number is divisible by 3or 9
import java.util.Scanner;

public class Divisible_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		if(num%3==0 && num%9==0)
		{
			System.out.println(num+" The number is Divible by  3 or 9");
		}
		else
		{
			System.out.println(num+" The number is NOT Divible by  3 or 9");
		}
	}

}
 