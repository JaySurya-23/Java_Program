package com.Array;



class Student {
	int id;
	String name;
	double marks;

	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	 public String toString()
	 {
	 return id+" "+name+" "+marks;
	 }
}
public class Arrayofobject {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s[] = new Student[3];

		s[0] = new Student(101, "jay", 70);
		s[1] = new Student(102, "hrashal", 77);
		s[2] = new Student(103, "om", 69.45);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].id + " " + s[i].name + " " + s[i].marks);
		}

	}

	}


