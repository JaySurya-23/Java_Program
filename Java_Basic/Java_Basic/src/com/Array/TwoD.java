package com.Array;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(".......................................");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(".................................");
		
		for(int x[]:a)
		{
			for(int e:x)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}

	}


