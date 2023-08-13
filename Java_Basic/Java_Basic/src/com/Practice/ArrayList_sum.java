package com.Practice;

import java.util.ArrayList;

public class ArrayList_sum {

	public static void main(String[] args) {

		ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(5);
		al.add(5);
		
		int sum=0;
		
		for(int i=0;i<al.size();i++)
			
		{
			sum+=al.get(i);
		}
		
		System.out.println(sum);
	}

}
