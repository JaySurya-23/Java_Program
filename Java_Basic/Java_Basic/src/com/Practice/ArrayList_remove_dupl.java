package com.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_remove_dupl {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(2);
		al.add(4);
		al.add(10);
		
		System.out.println(al);
		System.out.println("...............");
		int count=0;
		for(int i=0;i<al.size();i++)
		{
			count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==(al.get(j)))
				{
					count++;
					al.remove(i);
					j--;
					
				}
			}
		}
		System.out.println(al);
		
//		Iterator<Integer>it=al.iterator();
//		while(it.hasNext())
//		{
//			
//		
//		}
//		
		

	}

}
