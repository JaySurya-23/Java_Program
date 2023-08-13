package com.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ABCD
//		ABC
//		AB
//		A

		for(char i='A';i<='D';i++)
		{
			for(char j='D';j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
