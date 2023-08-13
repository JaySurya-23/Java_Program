package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee
{
	int eId;
	String eName;
	public Employee(int eId, String eName) {
		this.eId = eId;
		this.eName = eName;
	}
	
	public String toString()
	{
		return eId+" "+eName;
	}
}

class Department 
{
	int dId;
	String Dname;
	ArrayList<Employee>list;
	
	public Department(int dId, String dName, ArrayList<Employee> list) {
		this.dId = dId;
		Dname = dName;
		this.list = list;
	}
	
	
	public String toString()
	{
		return dId+" "+Dname;		
	}
}

public class Contain_Array_list {


	public static void main(String[] args) {
		
		ArrayList<Department>dl=new ArrayList<Department>();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter the Dapartment ID");
			int id=sc.nextInt();
			System.out.println("Enter the Daparment Name");
			String name=sc.next();
			
			ArrayList<Employee>elist=new ArrayList<Employee>();
			for(int j=1;j<=2;j++)
			{
				System.out.println("Enter the Emp id");
				int ide=sc.nextInt();
				System.out.println("Enter the Emp Name");
				String Ename=sc.next();
				
				elist.add(new Employee(ide,Ename));
			}
			
			dl.add(new Department(id,name,elist));
		}
		
		Iterator<Department>it=dl.iterator();
		while(it.hasNext())
		{
			Department d=it.next();
			System.out.println(d);
		}
		
		

	}

}
