package com.Collection;

import java.util.LinkedList;
import java.util.Scanner;


class Product
{
	int pid;
	String productName;
	int price;
	public Product(int pid, String productName, int price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
	}
	
}

public class Search {

	public static void main(String[] args) {

		
		LinkedList<Product>list=new LinkedList<>();
		list.add(new Product(1,"pendrive",500));
		list.add(new Product(2,"laptop",78000));
		list.add(new Product(3,"bag",500));
		list.add(new Product(4,"mobile",50000));

		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		for(int i=0;i<list.size();i++)
		{
			if(id==list.get(i).pid)
			{
				System.out.println(list.get(i));
			}
		}

	}

}
