package com.Collection;

import java.util.*;

public class DisplayList {


	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		
		al.add("pune");
		al.add("dhule");
		al.add("nashik");
		al.add("goa");
		
		System.out.println(al);
		
		System.out.println("....print list using for loop.....");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)+" ");
		}
		
		System.out.println(".....print list using for each loop....");
		
		for(String x:al)
		{
			System.out.println(x);
		}
		
		
		System.out.println("........using Iterator.....");
		
		
		Iterator<String>itr=al.iterator();
		
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		//System.out.println(itr.next());
		}

		
		System.out.println(".........ListIterator.......");
		
		ListIterator<String>ltr=al.listIterator();
		
		while(ltr.hasNext())
		{
			ltr.next();
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

}
