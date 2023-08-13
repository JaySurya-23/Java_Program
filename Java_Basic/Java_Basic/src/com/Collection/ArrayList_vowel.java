package com.Collection;

import java.util.ArrayList;

public class ArrayList_vowel {

	public static void main(String[] args) {
		
		ArrayList<Character>ac=new ArrayList<Character>();
		
		ac.add('a');
		ac.add('b');
		ac.add('e');
		ac.add('o');
		ac.add('i');
		ac.add('n');
		
		System.out.println("....ArrayList Character....");
		System.out.println(ac);
		System.out.println("...Vowel are ArrayList Character...");
		for(int i=0;i<ac.size();i++)
		{
			if(ac.get(i).equals('a')||ac.get(i).equals('e')||
			   ac.get(i).equals('i')||ac.get(i).equals('o')||
			   ac.get(i).equals('u'))
					
			{
				
				System.out.print(ac.get(i)+" ");
			}
		
		}
		

	}

}
