package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}


class Course
{
	int cId;
	String Cname;
	public Course(int cId, String cname) {
		super();
		this.cId = cId;
		Cname = cname;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", Cname=" + Cname + "]";
	}
	
}
public class DemoMap5 {
	public static void main(String[] args) {
		HashMap<Student , Course>hm=new HashMap<>();
		hm.put(new Student(101, "Jay"),new Course(1, "Java"));
		hm.put(new Student(102, "Om"), new Course(2, "C"));
		
		System.out.println(hm);
		System.out.println("...............................");
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<Student, Course>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Student, Course>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
