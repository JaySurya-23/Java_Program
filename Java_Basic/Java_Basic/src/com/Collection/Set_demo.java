package com.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Student1 
{
	int id;
	String name;
	int marks;
	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
//	@Override
//	public int compareTo(Student1 o) {
//		// TODO Auto-generated method stub
//		return o.marks-this.marks;
//	}
	
	
}

class Mymark implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
	
		return o2.marks-o1.marks;
	}
	
}
public class Set_demo {

	public static void main(String[] args) {
	
		HashSet<Student1>hl=new HashSet<>();
		hl.add(new Student1(101, "Jay", 49));
		hl.add(new Student1(105, "Manesg", 75));
		hl.add(new Student1(102, "Vedang", 90));
		hl.add(new Student1(103, "vedu", 78));
		
		
		
		TreeSet<Student1>tl=new TreeSet<>(new Mymark());
		tl.addAll(hl);
	
		System.out.println(".................................");
		
		ArrayList<Student1>al=new ArrayList<>(tl);
		for(Student1  s:al)
		{
		System.out.println(s);
		}

	}

}
