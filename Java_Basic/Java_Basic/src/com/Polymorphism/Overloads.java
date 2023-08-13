package com.Polymorphism;


public class Overloads {
	
	public  static void display()
	  {
		  System.out.println("Static method call");
	  }
	
	public static void display(int x)
	{
		System.out.println("overload static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloads.display();
		Overloads.display(10);

	}

}
