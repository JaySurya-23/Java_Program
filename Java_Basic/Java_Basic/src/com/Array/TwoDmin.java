package com.Array;

public class TwoDmin {

	public static void minrow (int arr[][])
	{
		
		for(int i=0;i<arr.length;i++)
			
		{
		    int min= arr[0][i];
			
			for(int j=0;j<arr[i].length;j++)
			{
				if(min > arr[i][j])
				{
					min=arr[i][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.print(" Row min ="+min);
			System.out.println();
		}
			
	}
	
	
	public static void mincol (int arr[][])
	
	{
		System.out.println("...minCol......");
		for(int i=0;i<arr.length;i++)
			
		{
		    int min= arr[0][i];
			
			for(int j=0;j<arr[i].length;j++)
			{
				if(min > arr[j][i])
				{
					min=arr[j][i];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.print(" col min ="+min);
			System.out.println();
		}
			
	}
	
	
	public static void main(String[] args) {
		
		int arr[][]={ { 3, 4, 6 }, { 8, 5, 1 }, { 2, 4, 5 } };
		
		TwoDmin.minrow(arr);
		TwoDmin.mincol(arr);

	}

}
