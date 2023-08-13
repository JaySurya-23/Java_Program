package com.for_loop;

public class Odd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				count++;
			}
			
		}
		
		System.out.println("The ODD number counting is = "+count);
		
	}

}
