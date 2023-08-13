package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeInfo
{
	int id;
	String name;
	public EmployeeInfo(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}

class Idinfo implements Comparator<EmployeeInfo>
{
 	@Override
	public int compare(EmployeeInfo o1, EmployeeInfo o2) {
		
		return o1.id-o2.id;
	}
	
}

public class Comparator_demo {

	public static void main(String[] args) {
  
		ArrayList<EmployeeInfo>al=new ArrayList<EmployeeInfo>();
		
		al.add(new EmployeeInfo(101, "Jay"));
		al.add(new EmployeeInfo(105, "mangesh"));
		al.add(new EmployeeInfo(102, "vedang"));
		
		for(EmployeeInfo e:al)
		{
			System.out.println(e);
		}
         
		Collections.sort(al,new Idinfo());
		System.out.println("...............................");
		for(EmployeeInfo e:al)
		{
			System.out.println(e);
		}
	

	}

}


