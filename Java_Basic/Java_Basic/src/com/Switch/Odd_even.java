package com.Switch;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check Odd or even");
		int num = sc.nextInt();
		switch (num % 2) 
		{
		case 0:
			System.out.println(num + " Number is Even");
			break;
		case 1:
			System.out.println(num + " Number is Odd");
		}

	}

}
