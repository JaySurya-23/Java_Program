package com.Polymorphism;

public class AreaOfall {
	
	
	public void area(float r)
	{
		
		System.out.println("Area of circle");
		float p=(float)3.14;
		p=p+r*r;
		System.out.println(p);
		
	}
	
	public void area(int b,int h)
	{
		System.out.println("\nArea of Triangle");
		float area=(b*h)/2;
		System.out.println(area);
		
	}
	
	public void area(float w,float h)
	{
		System.out.println("\nArea of Reactangle");
		float area=w*h;
		System.out.println(area);
		
	}
	
	public void area(int s)
	{
		System.out.println("\nArea of Square");
		float area=s*s;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaOfall a=new AreaOfall();
		a.area(5);//area of cricle
		a.area(10, 5);//area of triangle
        a.area(4, 7);//area of reactangle
        a.area(4);//area of s
		
	}

}
