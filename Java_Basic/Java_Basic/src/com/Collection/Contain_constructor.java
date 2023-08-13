package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Actor
{
	int aid;
	String aname;
	
	public Actor(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
	
}
class Movie
{
	int mid;
	String mname;
	Actor act;
	public Movie(int mid, String mname, Actor act) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.act = act;
	}
	
	
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", act=" + act + "]";
	}
	
	
}

public class Contain_constructor {

	public static void main(String[] args) {
	
		ArrayList<Movie>al=new ArrayList<Movie>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deatils of Movie and Actor");
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter movie id");
			int idm=sc.nextInt();
			System.out.println("Enter movie name");
			String namem=sc.next();
			System.out.println("enter actor id");
			int ida=sc.nextInt();
			System.out.println("Enter actor name");
			String namea=sc.next();
			
			Movie m=new Movie(idm, namem, new Actor(ida,namea));
			al.add(m);
		}
			
		Iterator<Movie>itr=al.iterator();
		while(itr.hasNext())
		{
			Movie e=itr.next();
			System.out.println(e);
		}
	}

}
