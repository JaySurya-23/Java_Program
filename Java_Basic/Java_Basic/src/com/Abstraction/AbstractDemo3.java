package com.Abstraction;

abstract class Operation
{
	int add;
	
	
	abstract void showDetails();
	public void show()
	{
		System.out.println("This is addition");
	}
	
	public void addition(int a,int b)
	{
		this.show();
		add=a+b;
		System.out.println(add);
	}
	
	
}
class Division extends Operation
{
	 int div;
	 void showDetails()
	 {
		 System.out.println("these is division");
	 }
	 
	 public void show(int a,int b)
	 {  
		 //this.show(10, 2);
		 div=a/b;
		 System.out.println(div);
	 }
}
class Multiplication extends Operation
{
	int mul;
	 void showDetails()
	 {
		 System.out.println("these is multiplication");
	 }
	 public void show(int a,int b)
	 {   
		 //this.show(10, 4);
		 mul=a*b;
		 System.out.println(mul);
	 }
	
}


public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation p=new Multiplication();
		p.addition(10, 10);
		p.showDetails();
		p.show();
	}

}
