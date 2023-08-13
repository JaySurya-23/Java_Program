package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}
	
	
	public int hashCode()
	{
		return id;
		
	}
	public boolean equals(Object o)
	{
		Employee e=(Employee) o;
		if(this.id==e.id && this.name.equalsIgnoreCase(e.name))
		//if(this.id==e.id)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
public class DemoMap4 {

	public static void main(String[] args) {
		
		HashMap<Employee,Integer>hm=new HashMap<>();
		hm.put(new Employee(102,"yash"),78000);
		hm.put(new Employee(101,"amit"),67000);
		hm.put(new Employee(200,"amit"), 56000);
		hm.put(new Employee(103,"amar"), 45000);
		
		
		System.out.println("...................................");
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<Employee, Integer>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Employee, Integer>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}

		

	}

}

