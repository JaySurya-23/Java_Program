package com.Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Demo_Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "Jay");
		hm.put(3, "vedang");
		hm.put(4, "mangesh");
		hm.put(2, "Vedu");
		
		
		System.out.println(".......TreeMap..................");
		TreeMap<Integer, String>tm=new TreeMap<>(new Mytree());
		tm.putAll(hm);
		
		for(Map.Entry<Integer, String>et:tm.entrySet()) {
			System.out.println(et.getKey()+" "+et.getValue());
		}
		System.out.println("-------Navigable map------------");
		NavigableMap<Integer, String>nm=tm.descendingMap();
		for(Map.Entry<Integer, String>em:nm.entrySet()){
			System.out.println(em.getKey()+" "+em.getValue());
		}
		
		
	}

}

class Mytree implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}
