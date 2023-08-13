package com.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_sort {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(9);
		al.add(8);
		al.add(7);
		al.add(6);
		al.add(5);
		
		System.out.println(al);
		
		System.out.println(".................");
		
		Collections.sort(al);
		
		System.out.println(al);
		
	}

}
