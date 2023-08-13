package com.IF_condition;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println(" Enter  the number");
           int i;
           int num=sc.nextInt();
           if(num%2==0)
           {
        	   System.out.println(" The Number is Even = "+num );
           }
           else
           {
        	   System.out.println(" The Number is odd ="+num);
           }
	}

}
