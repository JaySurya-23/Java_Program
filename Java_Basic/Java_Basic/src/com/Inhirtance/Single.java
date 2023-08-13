package com.Inhirtance;


 class Employees{
	 
	 int salary=4000;
 }
 
 class Developer extends Employees
 {
	 int bonus=10000;
 }

public class Single {

	public static void main(String[] args) {
	
		Developer d=new Developer();
		System.out.println("Employee salary is :"+d.salary);
		System.out.println("Bonus : "+d.bonus);

	}

}
