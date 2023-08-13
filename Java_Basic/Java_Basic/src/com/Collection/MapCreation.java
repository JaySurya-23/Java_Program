package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCreation {

	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		
		hm.put(1, "jay");
		hm.put(2, "harshal");
		hm.put(3, "Vedang");
		hm.put(4, "mangesh");
		hm.put(5, "jay");
		hm.put(1, "Om");
		
		System.out.println(hm);
		
		System.out.println("................for each............... ...........");
		for(Map.Entry<Integer, String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		System.out.println("...........Using Iterator entry set................");
		
		Set s=hm.entrySet();
		
		Iterator<Map.Entry<Integer, String>>lm=s.iterator();
		while(lm.hasNext())
		{
			Map.Entry<Integer, String>em=lm.next();
			System.out.println(em.getKey()+" "+em.getValue());
		}
		
		
		System.out.println("..........Using Iterator keyset..................");
		
		Set s2=hm.keySet();
		Iterator<Integer>im=s2.iterator();
		while(im.hasNext())
		{
			Integer i=im.next();
			System.out.println(i+" "+hm.get(i));
		}
		

	}

}
