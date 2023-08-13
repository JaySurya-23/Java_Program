package com.Array;

import java.util.Arrays;

public class Add_onebyone_ele {
	
	public static void add(int arr[],int arr1[])
	
	  
	{
		  int add[]=new int[arr.length+arr1.length];
		  int index=0;
		 
		  
		  for(int i=0;i<add.length;i++)
		  {
			  if(i<arr.length)
			  {
			  add[index]=arr[i];
			  index++;
			  }
			  if(i<arr1.length)
			  {
				  add[index]=arr1[i];
				  index++;
			  }
		  }
		  System.out.println(Arrays.toString(add));
		  
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int arr1[]= {100,200,300,400,500,600};
		
		add(arr, arr1);

	}

}
