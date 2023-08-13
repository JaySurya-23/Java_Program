package com.Collection;

import java.util.ArrayList;

public class ArrayList_method {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		
		System.out.println(al.isEmpty());
		
		al.add("ved");
		al.add("jay");
		al.add("vishwa");
		al.add("vedu");
		
		System.out.println(al.isEmpty());//check string is empty or not
		
		System.out.println(al.size());//check string element
		
		al.add(1,"mangesh");//use for add element 
		System.out.println(al);
		
		System.out.println(al.get(2));//print index position element 	
		
		al.set(1, "Harshal");//set method use to replace element 
		System.out.println(al);
		
		al.remove(1);//remove element index position
		System.out.println(al); 
		
      
		ArrayList list=new ArrayList();//non-ganaric method	
		list.add(100);
		list.add("jay");
		list.add(10.10);
		
		al.addAll(list);
		System.out.println(al);
	}

}
