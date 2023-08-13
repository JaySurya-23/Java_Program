package com.Practice;

import java.util.ArrayList;

public class ArrayList_vowel {
	
	public static void main(String[] args) {
		
		ArrayList<Character>cl=new ArrayList<Character>();
		
		cl.add('a');
		cl.add('b');
		cl.add('c');
		cl.add('d');
		cl.add('e');
		cl.add('i');
		cl.add('o');
		cl.add('u');
		
		System.out.println(cl);
		System.out.println("......................");
		for(int i=0;i<cl.size();i++)
		{
		   if(cl.get(i).equals('a')||cl.get(i).equals('e')||cl.get(i).equals('i')
		      ||cl.get(i).equals('o')||cl.get(i).equals('u'))
			   
		   {
			   System.out.print(cl.get(i)+" ");
		   }
		}
		
	}

}
