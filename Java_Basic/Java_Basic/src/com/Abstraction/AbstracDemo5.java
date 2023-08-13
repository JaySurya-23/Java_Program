package com.Abstraction;


abstract class Company
{
	
	Company(String a)
	{
		System.out.println("this is called constractor "+a);
	}
	
	abstract void display();
		
}

class Employee extends Company
{
	Employee()
	{
		super("jay");
	}
	public void display()
	{
		System.out.println("abstract.........");
	}
}



public class AbstracDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em=new Employee();
		em.display();
		
		
	}

}
