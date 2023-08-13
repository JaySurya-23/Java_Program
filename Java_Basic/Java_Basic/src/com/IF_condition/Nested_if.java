package com.IF_condition;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Persentage ");
		int per = sc.nextInt();
		System.out.println("Enter passing year");
		int year = sc.nextInt();
		if (per >= 60)
		{
			if (year == 2021)
			{
				System.out.println(" Candidate allow for interview");
			}
			else
			{
				System.out.println(" Candidate not allow for interview");
			}
		}

	}

}
