package com.While;

import java.util.Scanner;

public class Krishnamurthi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				int temp=num;
				int sum=0,digit;
				
				while(num>0)
				{
					digit=num%10;
					int fact=1;
					for(int i=1;i<=digit;i++)
					{
						fact=fact*i;
					}
					sum=sum+fact;
					num=num/10;
					
				}
				if(temp==sum)
				{
					System.out.println("krishn");
				}
				
				else
				{
					System.out.println("not");
				}
	}

}
