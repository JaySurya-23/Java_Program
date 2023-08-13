package com.Polymorphism;

public class Overloading_Arri {

	public void opration() {
		System.out.println("Arrithmathic opration ");
	}

	public void opration(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public void opration(float s1, float s2)
	{   
		
		System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));

	}

	public void opration(double m1, double m2) {
		System.out.println(m1 + " *" + m2 + " = " + (m1 * m2));
	}

	public void opration(long d1, long d2) {
		System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading_Arri o = new Overloading_Arri();
		o.opration();
		o.opration(10, 10);
		o.opration(10f, 10f);
		o.opration(10.0, 10.0);
		o.opration(10l, 10l);
	}

}
