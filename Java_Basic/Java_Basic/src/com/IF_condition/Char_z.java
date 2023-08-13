package com.IF_condition;
// wirte a code to check Z or not 
import java.util.Scanner;

public class Char_z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch=='z')
		{
			System.out.println(" This is Z ");
		}
		
		else
		{
			System.out.println(" This is not Z ");
		}
	}

}
