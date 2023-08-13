package com.Collection;

import java.util.LinkedList;

public class Linked_method {

	public static void main(String[] args) {


		LinkedList<String>list=new LinkedList<>();
		list.add("pune");
		list.offerFirst("mumbai");
		
		System.out.println(list);
		list.addFirst("Goa");
		System.out.println(list);
		
		list.offer("nasik");
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
		list.remove();
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
		//list.removeFirst();
		
		System.out.println(list.pollFirst());
		System.out.println(list);
		
		

	}

}
