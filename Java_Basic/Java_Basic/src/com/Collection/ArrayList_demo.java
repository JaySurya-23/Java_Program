package com.Collection;

import java.util.ArrayList;

//delete all the employee how are workinng in same deparament like id 10
class Employee1
{
	int id;
	String name;
	String dpart;
	public Employee1(int id, String name, String dpart) {
		super();
		this.id = id;
		this.name = name;
		this.dpart = dpart;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", dpart=" + dpart + "]";
	}
	
	
	
}
public class ArrayList_demo {

	public static void main(String[] args) {
		
		ArrayList<Employee1>al=new ArrayList<>();
		al.add(new Employee1(10, "Jay", "developer"));
		al.add(new Employee1(11, "Vedang", "HR"));
		al.add(new Employee1(15, "Mangesh", "developer"));
		
		System.out.println(al);
		System.out.println("..............................");
		
		String dname="";
//		for(Employee1 e:al)
//		{    
//			if(e.id==10)
//			{
//				dname=e.dpart;
//			}
//			if(e.dpart.equals(dname))
//			{
//				al.remove(e);
//			}
//		}
//		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).id==10)
			{
				dname=al.get(i).dpart;
			}
			
			if(al.get(i).dpart.equals(dname))
			{
				al.remove(al.get(i));
			}
		}
		
		System.out.println(al);
		
	}

}
