package com.String;

public class String_Comparison {

	public static void main(String[] args) {
		
		String str1="Java";
	//  String str2="Java";
		String str2="java";
        
		System.out.println("String comparsion with == :"+(str1==str2));
		
		System.out.println("........................................");
		
		String s1="java";
		String s2=new String("java");
		
		System.out.println("String comparsion with == :"+(str1==str2));
		
		
		
		System.out.println(".................Equal()........................");
		
		  
	     String st1="Java";
	     String st2= new String("Java");
	     
	     System.out.println("String comparsion with == :"+(st1.equals(st2)));
	     System.out.println("..............................................");
	     
	     
	     String string1= new String("Welcome");
	     String string2= new String("welcome");
	     
	     System.out.println("== :"+(string1==string2));
	     System.out.println("equals:"+(string1.equals(string2)));
	     System.out.println("equals Case:"+(string1.equalsIgnoreCase(string2)));
	     
	     
	     
	     
	}

}
