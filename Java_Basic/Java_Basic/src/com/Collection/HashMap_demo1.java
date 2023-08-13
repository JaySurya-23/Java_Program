package com.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Departments {
	int dId;
	String dName;

	public Departments(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}

}

class Employee2 {
	int id;
	String name;
	int salary;
	Departments dept;

	public Employee2(int id, String name, int salary, Departments dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Empployee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

}

public class HashMap_demo1 {

	public static void main(String[] args) {

		Departments dp = new Departments(1, "developer");
		HashSet<Employee2> hs = new HashSet<>();
		hs.add(new Employee2(101, "Jay", 45000, dp));
		hs.add(new Employee2(103, "Mangesh", 50000, dp));
		hs.add(new Employee2(102, "Vedang", 40000, new Departments(2, "HR")));
		hs.add(new Employee2(104, "vedu", 60000, dp));

		HashMap<Departments, Integer> hm = new HashMap<>();
		Iterator<Employee2> itr = hs.iterator();
		while (itr.hasNext()) {
			Employee2 e = itr.next();
			Departments d = e.dept;
			
			int sal = e.salary;
			int count = 1;

			if (hm.containsKey(d)) {
				count++;
				int a = hm.get(d);
				sal = sal + a;
				sal = sal / count;
				hm.put(d, sal);
			}

			else {
				hm.put(d, sal);
			}

		}

		System.out.println(hm);

	}

}
