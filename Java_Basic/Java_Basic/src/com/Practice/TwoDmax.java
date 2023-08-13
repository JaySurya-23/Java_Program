package com.Practice;

import java.util.Scanner;

public class TwoDmax {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			
			int max = arr[0][i];
			for(int j=0;j<arr[i].length;j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.print(" "+max);
			System.out.println();
		}
		

	
	}

}
