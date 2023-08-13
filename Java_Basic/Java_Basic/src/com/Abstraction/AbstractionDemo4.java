package com.Abstraction;


abstract class A
{
	abstract void deatils();
	
	public void display()
	{
		System.out.println("This is Abstract method ");
	}
}

class B extends A
{
	void deatils()
	{
	    System.out.println("This abstract inherit method");
	}
}


public class AbstractionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new B();
		a.display();
		a.deatils();

	}

}
