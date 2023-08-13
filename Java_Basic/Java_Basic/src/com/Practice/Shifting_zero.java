package com.Practice;

import java.util.Arrays;

public class Shifting_zero {
	
	public static void shiftzero(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
			
		System.out.println(Arrays.toString(arr));
      //  sortelement2(arr);
	}
	
	
//	public static void sortelement(int arr[])
//	{
//		int postion=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=0)
//			{
//				postion=i;
//				break;
//			}
//		}
//		System.out.println(postion);
//		
//		for(int i=postion;i<arr.length;i++)
//		{
//			
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
//	}
//	
	
	public static void sortelement2(int arr[])
	{

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) {
	
		int arr[]= {1,3,0,-7,5,0,4,8,0,-3};
		
		shiftzero(arr);	

	}

}
