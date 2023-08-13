package com.While;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp,rem,sum=0;	
		temp=num;
		 while(num>0) {
			 
			 rem=num%10;
			 sum=sum*10+rem;
			 num=num/10;
		 }
		 if(temp==sum)
		 {
			 System.out.println(" Palindrom "+sum);
		 }
		 
		 else
		 {
			 System.out.println(" not Palindrom "+sum);
		 }
	}

}
