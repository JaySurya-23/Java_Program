 package com.oops;

import java.util.Scanner;

public class Methods {

	public void prime() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		for (i = 2; i <= 10; i++) {
			if (num % i == 0)
				break;
		}

		if (i == num) {
			System.out.println("prime");
		} else {
			System.out.println("not");
		}
	}

	public void fact() {
		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			fact *= i;
		}

		System.out.println(fact);
	}
	
	public void areaofcricle()
	{
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		float pi=3.14f;
		pi=pi*r*r;
		System.out.println(pi);
		
	}
	
	public int armstrong()
	{			
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp,rem,sum=0;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Amrstrong");
		}
		else
		{
			System.out.println("not");
		}
		return num;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods m = new Methods();
		m.prime();

		Methods m1 = new Methods();
		m1.fact();
		
		Methods m2 = new Methods();
		m2.areaofcricle();
		
		Methods m3 = new Methods();
		m3.armstrong();
	}
	
	

}
