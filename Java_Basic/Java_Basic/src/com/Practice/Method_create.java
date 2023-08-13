package com.Practice;

public class Method_create {
	
//	public static void display()
//	{
//		System.out.println("jay");
//	}
	
	public Method_create() {
		System.out.println("Constructor ");
	}

	public Method_create(String a)
	{
		super();
		System.out.println("parametrized ");
	}
	
	public static void main(String[] args) {
		
		Method_create m=new Method_create();
		Method_create m1=new Method_create("jay");
		
		

	}

}
