package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class demoset1 {

	public static void main(String[] args) {
		
		HashSet<Integer>hs=new HashSet<>();
		hs.add(10);
		hs.add(12);
		hs.add(90);
		hs.add(23);
		System.out.println(hs.add(7));
		System.out.println(hs);
		
		LinkedHashSet<Integer>lh=new LinkedHashSet<>();
		lh.add(30);
		lh.add(7);
		lh.add(90);
		lh.add(23);
		
		
		System.out.println(lh);

	}

}
