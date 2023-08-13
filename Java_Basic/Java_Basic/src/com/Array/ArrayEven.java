package com.Array;

import java.util.Scanner;

public class ArrayEven {

	// find the even elements from the array
		public void findEven(int a[])
		{    
			int sum=0;
			
			
			//print even number using for each loop
			for(int num:a)
			{
				if(num%2==0)
				{
					System.out.println(num);
				}
				else
				{
					System.out.println(num);
				}
			}
			
			System.out.println("....................");
			System.out.println("Position on even number in array");
			
			//print even number position in array
			for(int i=0;i<a.length;i++)
			{
				
			
				if(a[i]%2==0)
				{
					System.out.println(i);
				}
			}
			
			System.out.println("....................");
		    System.out.println("odd number in array  ");
		    
		    
			//print odd number in array using for each loop
			for(int no:a)
			{
				if(no%2!=0)
				{
					System.out.println(no);
				}
			}
			
			System.out.println("....................");
			System.out.println("odd number  sum in array ");
			for(int n:a)
			{   
			    
				if(n%2!=0)
				{
					sum=sum+n;
					
				}
			}
			System.out.println(sum);
		
		}
		

		public static void main(String[] args) {
		
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("...............................");
			System.out.println("Even number in array ");
			ArrayEven dl=new ArrayEven();
			dl.findEven(a);

		}


}
