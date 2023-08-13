package com.oops;


public class A {
	int num;
	A(int num)
	{
		this();
		this.num = num;
	}

	A()
	{
		this(5,6);
	}
	
	A (int i , int j)
	{
		
	}

	void show()
	{

	}

	 A getObject() 
	 {
		this.show();
		changeNum(this);
		return this;

	}

	void changeNum(A a)
	{
		a.num = a.num + 10;
	}

	public static void main(String[] args) {

		A a = new A(10);
		A newAObje = a.getObject() ;
		System.out.println(a == newAObje);
		
	}
}
	
	
