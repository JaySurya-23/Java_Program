package com.IF_condition;

import java.util.Scanner;

public class Upper_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter any Char");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println(" This is Lower case char");
		}
		
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("This is Upper case char");
		}
		
		else
		{
			System.out.println(" Other letter");
		}
	}

}
