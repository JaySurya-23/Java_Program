package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

class Hotel implements Comparable<Hotel>
{
	int Hid;
	String name;
	public Hotel(int hid, String name) {
		
		Hid = hid;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Hotel [Hid=" + Hid + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Hotel o) {
		
		return o.Hid-this.Hid;
	}
	
	
	
}
public class Comparable2 {

	public static void main(String[] args) {
		
		ArrayList<Hotel>al=new ArrayList<Hotel>();
		al.add(new Hotel(101, "Taj"));
		al.add(new Hotel(102, "The Leela"));
		
		for(Hotel h:al)
		{
			System.out.println(h);
			
		}
		
		Collections.sort(al);
		System.out.println("...............................");
		
		for(Hotel h:al)
		{
			System.out.println(h);
			
		}

	}

}
