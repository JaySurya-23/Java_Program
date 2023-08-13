package com.While;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1, num = 5, i = 1;

		while (i <= num) 
		{
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
