package com.for_loop;

public class Continue_break {

	public static void main(String[] args) {
		// print number 1 to 20 and divisible by 4 and 6 then stop loop and continue
		
		for (int i = 1; i <=20; i++)
		{
			if (i % 4 == 0 || i % 6 == 0)
			{
				//System.out.println("\nnumber is Divisible by 4 and 6 = "+i);
				continue;
			}
			if (i % 4 == 0 && i % 6 == 0)
			{
				//System.out.println("\nnumber is Divisible by 4 and 6 ="+i);
				break;
			}
			System.out.println(i);
		}
		
	}

}
