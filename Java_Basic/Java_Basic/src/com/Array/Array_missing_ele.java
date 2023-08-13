package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_missing_ele {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7};
	    System.out.println(Arrays.toString(arr));
		for(int i=1;i<=arr.length;i++)
		{
			boolean ispresent=false;
			
			for(int j=0;j<arr.length;j++)
			{
				
				if(i==arr[j])
				{
					ispresent=true;
				}
				
			}	
				if(ispresent==false)
				{
					System.out.println(i);
				}			
		}
		}
}
		
//		public static void missElement(int a[])
//		
//		{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter Num: ");
//			int n = sc.nextInt();
//			for(int i=0;i<=n;i++) 
//			{
//				boolean isPresent = false;
//				for(int j=0;j<a.length;j++)
//				{
//					if(i==a[j])
//					{
//						isPresent=true;
//					}
//				}
//				
//				if(isPresent==false)
//					System.out.println(i);
//			}
		
		
//	}
//
//}
