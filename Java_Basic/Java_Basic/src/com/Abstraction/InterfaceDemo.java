package com.Abstraction;


interface Moveable
{
	
	void move();//Abstract
	
	
	 default void run()
	{
		 display();
		System.out.println("Moveing");
	}
	 private void display()
	 {
		 System.out.println("this is version 1.9 method ");
	 }
}

class Run implements Moveable
{ 
	
	void Run(int a)
	{
		
	}
	public void move()
	{   
		
		System.out.println("run");
	}
}

class Speed implements Moveable
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Moveable m=new Run();
				m.move();
				m.run();
	}

}
