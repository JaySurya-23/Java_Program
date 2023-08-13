package com.Array;

import java.util.Scanner;

class Courses
{
	private int cid;
	private double cfee;
	
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public int getCid() {
		return cid;
	}
	
	public double getCfee() {
		return cfee;
	}
	public void setCfee(double cfee) {
		this.cfee = cfee;
	}
	
	
}

class Stud 
{
	private int sid;
	private String sname;
	private Courses course;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	
	
}

public class ObjectArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stud[] s=new Stud[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{
			
			System.out.println("Enter the Student ID ");
			int sid=sc.nextInt();
			System.out.println("Enter Student Name ");
			String sname=sc.next();
			System.out.println("Enter course ID ");
			int cid=sc.nextInt();
            System.out.println("Enter course Fee");
            double cfee=sc.nextDouble();
            
            Stud st=new Stud();
            st.setSid(sid);
            st.setSname(sname);
            st.setCourse(new Courses());
            st.getCourse().setCid(cid);
            st.getCourse().setCfee(cfee);
            
            
            s[i]=st;
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getSid());
			System.out.println(s[i].getSname());
			System.out.println(s[i].getCourse().getCid());
			System.out.println(s[i].getCourse().getCfee());
		}

	}

}
