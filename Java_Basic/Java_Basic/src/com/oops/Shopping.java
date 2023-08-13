package com.oops;

import java.util.Scanner;

public class Shopping {

	int product_id;
	String product_name;
	int quntity;
	float price;
	float total;

	public void productdatils(int id, String p_name, int q, float p)

	{
		product_id = id;
		product_name = p_name;
		quntity = q;
		price = p;
		

	}

	public void calculate_bill() {
		

		if (quntity > 0) {
			total = price * quntity;
			this.display();
			
		}

		else {
			System.out.println("Sorry!! You Have zero quntity of product");
		}
	}

	public void display() {
		System.out.println(
				product_id + " " + product_name + " " + quntity + " " + price + " All product price is : " + total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the all Details of product \n ");
//		System.out.println("Product_ID \tProduct_name\tProduct_qunity\tProduct_price");
//		int product_id = sc.nextInt();
//		String product_name = sc.next();
//		int quntity = sc.nextInt();
//		float price = sc.nextFloat();

		Shopping s = new Shopping();
		s.productdatils(1, "mobile", 0, 14000);;
		s.calculate_bill();

	}

}
