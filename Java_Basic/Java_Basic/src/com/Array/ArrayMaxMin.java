package com.Array;

import java.util.Scanner;

public class ArrayMaxMin {
	
	
//	        public void max(int no[])
//	        {
//	        	int maxno=no[0];
//	        	int minno=no[0];
//	        	
//	        	for(int i=0;i<no.length;i++)
//	        	{
//	        		if(maxno<no[i])
//	        		{
//	        			maxno=no[i];
//	        		}
//	        		else if(minno>no[i])
//	        		{
//	        			minno=no[i];
//	        		}
//	        	}
	
	public void max(int no[])
	{
		int max=no[0];
		int min=no[0];
		
		for(int i=0;i<no.length;i++)
		{
			if(max<no[i])
			{
				max=no[i];
			}
			
			else if(min>no[i])
			{
				min=no[i];
			}
		}
	        	System.out.println("Max value in the array = "+max+"  minimum value in the array = "+min);
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int no[]=new int[5];
		 	
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("enter array element");
		 	
		 	for(int i=0;i<no.length;i++)
		 	{
		 		no[i]=sc.nextInt();
		 	}
		 	
		 	ArrayMaxMin a=new ArrayMaxMin();
		 	a.max(no);
		 	
		 	
	}

}
