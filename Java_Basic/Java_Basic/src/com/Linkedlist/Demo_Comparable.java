package com.Linkedlist;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
    public int compareTo(Employee e)
    {
    	return this.id-e.id;
    }
	
}

public class Demo_Comparable {

	public static void main(String[] args) {
		
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		
		al.add(new Employee(110,"jay",1200));
		al.add(new Employee(102,"surya",1000));
		al.add(new Employee(101,"Om",12000));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println(".................");
		Collections.sort(al);
		
		for(Employee e:al)
		{
			System.out.println(e);
		}

	}

}
