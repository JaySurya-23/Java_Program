package com.Collection;

import java.util.ArrayList;

public class Create_arraylist {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();//non-ganaric method
		
		list.add(100);
		list.add("jay");
		list.add(10.10);
		
		System.out.println(list);
        System.out.println("..................");
        
        ArrayList<Integer>al=new ArrayList<Integer>();//ganaric method
        
        al.add(100);
        al.add(10);
        
        System.out.println(al);
        
        for(Integer x:al)
        {
        	System.out.println(x);
        }
	}

}
