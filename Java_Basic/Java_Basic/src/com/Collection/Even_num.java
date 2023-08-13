package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Even_num {
       
	public static void main(String[] args) {
	   
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(2);
		al.add(6);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(7);
		al.add(8);
		
		System.out.println(al);
	 
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				System.out.println(al.get(i));
			}
		}
		
		System.out.println("..........................");
		
		Iterator<Integer>it=al.iterator();
		while(it.hasNext())

		{
            
			System.out.println(it.next());
			if(it.hasNext())
			{
			it.next();
			}
			
			
//			if(it.hasNext())
//			{
//				it.next();
//			}
//			System.out.println(it.next());
		}
		
	}
}
