package com.Array;

import java.util.Scanner;

class Students {
	int id;
	String name;

	Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

}

class Course {
	int cid;
	String cname;
	Students stud;

	public Course(int cid, String cname, Students stud) {
		this.cid = cid;
		this.cname = cname;
		this.stud = stud;
	}

	public String toString() {
		return cid + " " + cname + " " + stud;
	}
}

public class ObjectArray {

	public static void main(String[] args) {
		Course c[] = new Course[3];

		// c[0]=new Course(1,"Java",new Student(101,"Amit"));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details");
		for (int i = 0; i < c.length; i++) {
			System.out.println("Enter the course id");
			int cid = sc.nextInt();
			System.out.println("Enter the course name");
			String cname = sc.next();
			System.out.println("Enter the stud id");
			int sid = sc.nextInt();
			System.out.println("Enter the stud name");
			String sname = sc.next();
			Students s = new Students(sid, sname);
			c[i] = new Course(cid, cname, s);

			// c[i]=new Course(cid,cname,new Student(sid,sname));

		}

		System.out.println("..............................");

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}