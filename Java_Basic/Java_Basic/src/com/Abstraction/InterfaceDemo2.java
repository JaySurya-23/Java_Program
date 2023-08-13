package com.Abstraction;


interface Area
{
	int a=10;
	
	void cricle();//this method is by default public and Abstract 
	
	 default void display()
	{
		double area ,r=5;
		double pi=3.14;
		area=pi*r*r;
		System.out.println("This is area of cricle :"+area);
		
	}
}

class React implements Area
{


	public void cricle() {
	     
		System.out.println("This is implement method");	
	}
	
	
	public void diplay()
	{
	    Area.super.display();
		System.out.println("*********");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a=new React();
		a.cricle();
		a.display();
		
		
		
		
		

	}

}
