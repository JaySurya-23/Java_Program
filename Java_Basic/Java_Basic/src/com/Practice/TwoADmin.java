package com.Practice;

import java.util.Scanner;

public class TwoADmin {

	public static void main(String[] args) {
		
		int arr[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[0][i];
			for(int j=0;j<arr[i].length;j++)
			{
				if(min>arr[j][i])
				{
					min=arr[j][i];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.print(" "+min);
			System.out.println();
		}
		

}

}
