package com.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap1 {
	
	public static void main(String[] args) {
		
		HashMap<String, String>hm=new HashMap<>();
		hm.put("123", "BJP");
		hm.put("456", "congress");
		hm.put("789", "BJP");
		hm.put("555", "Shivsena");
		hm.put("111", "Shivsena");
		hm.put("222", "BJP");
		
		
		HashMap<String,Integer >m=new HashMap<>();
		Set s1=m.entrySet();
	    Iterator<Map.Entry<String , String>>itr=s1.iterator();
		while(itr.hasNext())
		{
			int count=0;
			Map.Entry<String , String>me=itr.next();
			if(m.containsKey(me.getValue()))
			{
				count=m.get(me.getValue());
				count++;
			}
			else
			{
				count++;
			}
			m.put(me.getValue(), count);
		}
		

		
	    System.out.println("......................................");
		
		ArrayList<String>al=new ArrayList<>(hm.values());

		
		for(int i=0;i<al.size();i++)
		{
			int count=Collections.frequency(al, al.get(i));
			m.put(al.get(i), count);
		}
		
		Set s=m.entrySet();
		
	    Iterator<Map.Entry<String , Integer>>itr1=s.iterator();
		while(itr1.hasNext())
		{
			Map.Entry<String , Integer>me=itr1.next();
			
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	    	
	}

}
