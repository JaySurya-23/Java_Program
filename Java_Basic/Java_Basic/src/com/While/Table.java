package com.While;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Numbers");
		int num=sc.nextInt();
		int table,i=1;
		
		while(i<=10)
		{
			
				table=num*i;
				System.out.println(num+ " * "+i+ " = "+table );
				i++;

		}
		
	}
	
	

}
