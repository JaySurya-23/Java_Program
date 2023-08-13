 package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {
	
	public static void Serach(int arr[],int num)
	{
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
			System.out.println("number is present");
		}
		else
		{
			System.out.println("Not present");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
        
         int arr[]= {2,3,4,5,2};
         System.out.println(Arrays.toString(arr));
         int num=sc.nextInt();
   
      SearchArray.Serach(arr ,num);
	}

}
