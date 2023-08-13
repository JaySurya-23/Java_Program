package com.for_loop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter any Number and Print table");
			int num=sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				int table=num*i;
				
				
				System.out.println(num+" * "+i+" = "+table);
			}
	}

}
