package com.Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Student 
{
	int id;
	String name;
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
//	@Override
//	public int compareTo(Student o) {
//		
//		//return this.id-o.id;
//		
//	   // return this.name.compareTo(o.name);//assinding
//	    return o.name.compareTo(this.name);//dessingding
//	}
	
	
}

class Mykey implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
public class Student_Map {

	public static void main(String[] args) {
		HashMap<Student, String>hm=new HashMap<>();
		hm.put(new Student(101, "vedu"), "Java");
		hm.put(new Student(103, "Mangesh"), "C++");
		hm.put(new Student(102, "Jay"), "Full Stack");
		
		TreeMap<Student, String>tm=new TreeMap<>(new Mykey());
		tm.putAll(hm);

		for(Map.Entry<Student, String>em:tm.entrySet())
		{
			System.out.println(em.getKey()+" "+em.getValue());
		}
	}

}
