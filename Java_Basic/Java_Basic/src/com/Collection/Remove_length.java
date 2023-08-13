package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove_length {

	public static void main(String[] args) {
	
		ArrayList<String>al=new ArrayList<String>();
		al.add("c");
		al.add("c++");
		al.add("java");
		al.add("htlm");
		
		System.out.println(al);

		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).length()>3)
			{
				al.remove(i);
     		    i--;
			}
		}
		System.out.println(al);
		
		System.out.println("..........");
		
		Iterator<String>st=al.iterator();
		while(st.hasNext())
		{
			String s=st.next();
			
			if(s.length()>3)
			{
				st.remove();
			}
		}
		System.out.println(al);
	}

}
