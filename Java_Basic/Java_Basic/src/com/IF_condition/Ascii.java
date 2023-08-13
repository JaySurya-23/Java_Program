package com.IF_condition;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet , Digit or Character");
		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : is a Small alphabets");
		}

		else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : is a Alphabet ");
		}

		else if (ch >= '0' && ch <= '9') {
			System.out.println(" Digit ");
		}

		else {
			System.out.println(ch + " : Special Character ");
		}

	}

}
