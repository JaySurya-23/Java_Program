package com.do_while;

import com.encapsulation.Modifir;

public class Access {
	
		void Showing()
		{
			Modifir m1=new Modifir();
			
			System.out.println(m1.name);
//			System.out.println(m1.roll);
//			System.out.println(m1.course);
//			System.out.println(m1.age);
//					
		}
	}
	
	class C extends Modifir
	{
		void Display()
		{
//			System.out.println(roll);
			System.out.println(name);
//	    	System.out.println(age);
			System.out.println(course);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
