package com.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer , String >tm=new TreeMap<>();
		tm.put(3, "jay");
		tm.put(1, "harshal");
		tm.put(2, "om");
		
		System.out.println(tm);
		
		Set s=tm.entrySet();
		
		
		Iterator<Map.Entry<Integer ,String >>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
				
		System.out.println();
		NavigableMap<Integer, String>nm=tm.descendingMap();
		
		for(Map.Entry<Integer, String>m:nm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
