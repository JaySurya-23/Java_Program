package com.for_loop;

public class Table_1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int table=0;
		

		for (int i = 1; i <=5; i++)
		{
			for (int j = 1; j <= 10; j++) 
			{
				table = i * j;
				
				System.out.println(i+" X "+j+" = "+table);
			}
			
		}

	}

}
