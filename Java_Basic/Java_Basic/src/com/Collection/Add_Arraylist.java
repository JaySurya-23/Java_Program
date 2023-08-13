	package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Add_Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
	  //al.add(5);
		
		
		
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
	    al2.add(500);
		
		
		
		ArrayList<Integer>al3=new ArrayList<Integer>();
	   //al3=[al.size()+al2.size()];
		for(int i=0;i<al3.size();i++)
		{
			if(i<al.size())
			{
				al3.add(al.get(i));
			}
			if(i<al2.size())
			{
				al3.add(al2.get(i));
			}
		}
		System.out.println(al3);
		
		
//		Iterator<Integer>it=al.iterator();
//		Iterator<Integer>it2=al2.iterator();
//		while(it.hasNext()||it2.hasNext())
//		{
//			Integer a=it.next();
//			
//			Integer b=it2.next();
//			al3.add(a);
//			al3.add(b);
//		}
//		
//		System.out.println(al3);
//      
	}

}
