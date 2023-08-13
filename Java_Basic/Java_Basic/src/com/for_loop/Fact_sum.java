package com.for_loop;

public class Fact_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int i,num=5,fact=1,sum=0;
		
		 for(i=1;i<=num;i++)
		 {
			 fact=fact*i;
			 sum=sum+fact;	
		 }
		 System.out.println(sum);
	}

}
