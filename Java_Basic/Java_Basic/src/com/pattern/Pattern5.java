package com.pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A
//		AB
//		ABC
//		ABCD

		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
