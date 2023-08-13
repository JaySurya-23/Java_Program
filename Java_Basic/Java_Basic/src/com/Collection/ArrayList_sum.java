package com.Collection;

import java.util.ArrayList;

public class ArrayList_sum {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		int sum=0;
		al.add(10);
		al.add(2);
		al.add(10);
		al.add(5);
		
		for(int i=0;i<al.size();i++)
		{
			
			sum=sum+al.get(i);
		}

		System.out.println(sum);
	}

}
