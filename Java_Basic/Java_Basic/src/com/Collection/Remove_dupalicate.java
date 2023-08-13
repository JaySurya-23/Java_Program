package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Remove_dupalicate {

	public static void main(String[] args) {
		
		ArrayList<Character>ac=new ArrayList<Character>();
		
		ac.add('a');
		ac.add('c');
		ac.add('a');
		ac.add('b');
		ac.add('d');
		
		
		
		System.out.println(ac);
	int count=0;	
	for(int i=0;i<ac.size();i++)
	{
		count=1;
		
		for(int j=i+1;j<ac.size();j++)
		{
			if(ac.get(i).equals(ac.get(j)))
			{
				count++;
				ac.remove(j);
				j--;
			}
		}
		System.out.println(ac.get(i)+" "+count);
		
	}
	   // Collections.sort(ac);
	    
	    for(int i=0;i<ac.size();i++)
	    {
	    	int count2=1;
	    	for(int j=i+1;j<ac.size();j++)
	    	{
	    	if(ac.get(i)>ac.get(j))
	    	{
	    		char temp=ac.get(i);
	    		//char temp2=ac.get(j);
	    		ac.set(i,ac.get(j));
	    		ac.set(j,temp);
	    	}
	    	}
	    }
	
	System.out.println(ac);
		
		System.out.println(".......................");
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(11);
		al.add(10);
		al.add(10);
		System.out.println(al);
		
		int count1=0;
		for(int i=0;i<al.size();i++)
		{
			count1=1;
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==(al.get(j)))
				{
					count1++;
					al.remove(j);
					j--;
				}
				
			}
			System.out.println(al.get(i)+" "+count1);
			
		}
		
		Collections.sort(al);
		System.out.println(al);
	}
	
	

}
