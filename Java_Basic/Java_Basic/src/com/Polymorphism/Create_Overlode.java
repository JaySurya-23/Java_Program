package com.Polymorphism;

public class Create_Overlode {
	
	public static void display()
	{
		int a=10;
		System.out.println(a);
	}
	
	public void display(int c,int b)
	{
		c=10;
		b=10;
		System.out.println(c+" "+b);
	}

	public static void main(String[] args) {
		
          Create_Overlode c=new Create_Overlode();
          c.display();
          c.display(0, 0);
	}

}
