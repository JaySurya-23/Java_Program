package com.Abstraction;

abstract class Hotel
{
	public Hotel()
	{
		System.out.println("Taj hotel");
	}
	abstract void display();

}

class Staff extends  Hotel
{    
//	
//	public Staff(int i) {
//		super(i);
//		// TODO Auto-generated constructor stub
//	}

	void display()
	{
		System.out.println("Welcome");
	}
	
}
 
class Menu extends Hotel
{
	

//	public Menu(int i) {
//		super(i);
//		// TODO Auto-generated constructor stub
//	}

	void display()
	{    
		//super.display();
		System.out.println("briyani");
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
	     Hotel h=new Menu();
	     h.display();
	     
	}

}
