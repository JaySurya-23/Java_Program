package com.Array;

public class TwoDmax {
	
public static void maxColsValue(int a[][]) {
		
		System.out.println("...........MaxCol............");
		for (int i = 0; i < a.length; i++)
		{
			int max = a[0][i];

			for (int j = 0; j < a[i].length; j++)
			{
				if (max < a[j][i])
				{
					max = a[j][i];
				}
				System.out.print(a[i][j]+" ");
				

			}
			System.out.print(" "+max);
			System.out.println();
		}
	}

public static void maxRowValue(int a[][]) {
	
	System.out.println("...........MaxROW............");
	for (int i = 0; i < a.length; i++) {
		int max = a[0][1];

		for (int j = 0; j < a[i].length; j++)
			
		{
			
			if ( max < a[i][j] )
			{
				max = a[i][j];				
			}
			System.out.print(a[i][j]+" ");           
		}
		System.out.print("  "+max);
		 System.out.println();
		
	}
}

	public static void main(String[] args) {
		int arr[][] = { { 3, 4, 6 }, { 8, 5, 1 }, { 1, 4, 5 } };
		
		TwoDmax.maxRowValue(arr);
		TwoDmax.maxColsValue(arr);

	}

}
