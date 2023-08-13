package com.Constructor;

public class Parameter_cons {
	
	public Parameter_cons()
	{ 
		
		System.out.println("hello");
		
	}
	
	public Parameter_cons(int a,int b)
	{
		System.out.println(+(a+b));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameter_cons pc=new Parameter_cons(10,4);
		Parameter_cons c=new Parameter_cons();

	}

}
