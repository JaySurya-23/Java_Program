package com.for_loop;

public class Continue_sts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=30;i++)
		{
			if(i%3==0)
			{
				//System.out.println(" Number is divisible by 3 = "+i);
				continue;
			}
			System.out.println(i);
		}
			

	}

}
