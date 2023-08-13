package com.Constructor;

public class Bsic_constructor {

	String order_city;

	public Bsic_constructor() {
		this(101,"PenDrive");
		System.out.println("This is my order");
	}

	public Bsic_constructor(String ordercity) {
		this();
		this.order_city = ordercity;

	}
	
	public Bsic_constructor(int order_id,String Product_name)
	{
		System.out.println(order_id+" "+Product_name);
	}

	public void display() {

		System.out.println(order_city);
	}

	public static void main(String[] args) {

		Bsic_constructor o2 = new Bsic_constructor("pune");
		o2.display();

	}

}
