package com.oops;

import java.util.Scanner;

class Customer {
	private int id;
	private String name;
	private int balance = 10000;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class Practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Jay");
		System.out.println("enter amount :");
		int num = sc.nextInt();
		int amount = c.getBalance();
		int rem_amount = amount - num;
		
		System.out.println("id: "+c.getId() + " Name: " + c.getName() + "  Main Balance : " + c.getBalance());
		c.setBalance(rem_amount);
		System.out.println("Available Balance : "+c.getBalance());

	}

}
