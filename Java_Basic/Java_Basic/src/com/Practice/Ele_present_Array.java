package com.Practice;

import java.util.Scanner;

public class Ele_present_Array {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		boolean ispresent=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				ispresent=true;
			}
		}	
		
			if(ispresent==true)
			{
				System.out.println("present");
			}
			
			else {
				System.out.println("not ");
			}
		
		
		
	}

}
