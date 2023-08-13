package com.pattern;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ABCD
//		ABC
//		AB
//		A
		for (char i = 'D'; i >= 'A'; i--)
		{
			for (char j = 'A'; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
	}

}
}