package com.Switch;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vowel char");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println("This is Vowel");
			break;
		case 'e':
			System.out.println("This is Vowel");
			break;
		case 'i':
			System.out.println("This is Vowel");
			break;
		case 'o':
			System.out.println("This is Vowel");
			break;
		case 'u':
			System.out.println("This is Vowel");
			break;
		default
		:
			System.out.println("Consonent");
		}

	}

}
