package com.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Highest_salary {
	
	int id;
	String name;
	int salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Highest_salary>al=new ArrayList<Highest_salary>();
//		System.out.print("Enter the no. of employee: ");
//		int emp=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter the employee id: ");
			int id=sc.nextInt();
			System.out.print("Enter the employee name: ");
			String name=sc.next();
			System.out.print("Enter the employee salary: ");
			int salary=sc.nextInt();
			
			Highest_salary em=new Highest_salary();
			em.setId(id);
			em.setName(name);
			em.setSalary(salary);
			
			al.add(em);

		}
		
		int maxsal=0;
		for(Highest_salary h:al)
		{
			if(h.getSalary()>maxsal)
			{
				maxsal=h.getSalary();
			}
			
		}
		
		for(Highest_salary h:al)
		{
			if(h.getSalary()==maxsal)
			{
				System.out.println(h.getId()+" "+h.getName()+" "+h.getSalary());
			}
		}
		
//		for(Highest_salary em1:al) 
//		{
//			System.out.println(em1.getId()+" "+em1.getName()+" "+em1.getSalary());
//		}
//		
//		int maxSalary=0;
//		String highestPaid=null;
//		int count=0;
//		int arr[]=new int[5];
//		String str[]=new String[5];
//		
//		for(Highest_salary em1:al)
//		{
//			if(em1.getSalary()>=maxSalary)
//			{
//				maxSalary=em1.getSalary();
//				arr[count]=maxSalary;
//				highestPaid=em1.getName();
//				str[count]=highestPaid;
//				count++;
//			}
//			
//		}
//		for(int i=0;i<count;i++) {
//			System.out.println(arr[i]+" "+str[i]);
//		}

	}

}
