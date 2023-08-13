package com.oops;

public class Car {
	
	int model;
	String name;
	double price;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c=new Car();
		 c.model= 145 ;
		 c.name="Hyunda Car";
		 c.price=120000.0;
		 
		 System.out.println(c.model+ " "+c.name+" "+c.price);
		 
		 Car c1=new Car();
		 c1.model=789;
		 c1.name="Swift";
		 c1.price=750000;
		 System.out.println(c1.model+" "+c1.name+" "+c1.price);
		 
		 Car c2=new Car();
		 c2.model=569;
		 c2.name="Inova";
		 c2.price=950000;
		 System.out.println(c2.model+" "+c2.name+" "+c2.price);
		
	}

}
