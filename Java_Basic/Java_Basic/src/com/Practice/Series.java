package com.Practice;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int n = sc.nextInt();
	        int a = 1, b = 2 ,c=0;
	        System.out.print(a + " " + b );
	        for (int i = 1; i <= n; i++) {
	            c = a + b;
	            System.out.print(" "+c+" ");
	            a = b;
	            b = c;
	          
	        }
	    }

	}


