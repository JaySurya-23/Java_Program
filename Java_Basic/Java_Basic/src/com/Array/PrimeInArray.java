package com.Array;

import java.util.Scanner;

public class PrimeInArray {
	
	
	public void Prime(int a[])
	{    
		
		
		int i,j;
		
		for( i=0;i<a.length;i++)
		{
			
		for( j=2;j<a[i];j++)
			
		{
			if(a[i]%j==0)
			break;
		}
		
		if(j==a[i])
		{
			System.out.println("prime  :"+j);
		}
		
		else
		{
			System.out.println("not prime :"+a[i]);
		}
		
		}
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array");
		int a[]=new int[4];	
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			PrimeInArray p=new PrimeInArray();
			p.Prime(a);
	}
}
