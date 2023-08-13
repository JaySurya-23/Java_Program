package com.encapsulation;

public class Modifir {

	
		private int roll;
		public  String name;
		int age;
		protected String course;
}	
	class A
	{
		void show()
		{
			Modifir m=new Modifir();
			System.out.println(m.name);
		  //System.out.println(m.roll);
			System.out.println(m.age);
			System.out.println(m.course);
		}
	}
	
	class B extends Modifir
	
	{
		void display()
		{
			Modifir m1=new Modifir();
		//	System.out.println(roll);
			System.out.println(name);
			System.out.println(age);
			System.out.println(course);
		}
		
	}
	



		
			
	


