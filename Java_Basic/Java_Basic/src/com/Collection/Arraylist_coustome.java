package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Employeise
{
	int id;
	String name;
	double salary;
	public Employeise(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Arraylist_coustome {

	public static void main(String[] args) {
		
		ArrayList<Employeise>al=new ArrayList<>();
		al.add(new Employeise(101, "Jay",15000 ));
		al.add(new Employeise(103, "Mangesh", 18000));
		al.add(new Employeise(102, "Vedang", 22000));
		
        System.out.println(al);
        System.out.println("....................................");
        
        for(Employeise e:al)
        {
        	if(e.salary<20000)
        	{
        		e.salary=e.salary+e.salary*0.10;
        	}
        }
        System.out.print(al);
		

	}

}
