package com.Array;

public class TwoDSum {
	
	public static void rowSum(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++)
			{
				sum = sum + a[i][j];
				System.out.print(a[i][j] + " ");
			}

			System.out.print(" Row sum=" + sum);
			System.out.println();
		}
	}
	
	public static void ColSum(int a[][])
	{
		System.out.println("...........................");
		for (int i = 0; i < a.length; i++)
		{
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) 
			{
				sum = sum + a[j][i];
				System.out.print(a[i][j] + " ");
			}
			System.out.print(" Colume sum=" + sum);
			System.out.println();
		}
	}



	

	public static void main(String[] args) {
		int arr[][] = { { 3, 4, 6 }, { 8, 5, 1 }, { 1, 4, 5 } };

		TwoDSum.rowSum(arr);
		TwoDSum.ColSum(arr);
		
		
		
	

	}

}
