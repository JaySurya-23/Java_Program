package com.String;

public class String_immutable {

	public static void main(String[] args) {
	

	     String s1="Hello ";
	     System.out.println(s1);
	     
	    // s1.concat("World");
	     s1=s1+"World";
	     System.out.println(s1);
	     
	     System.out.println("---------------------------------------------");
	     String s2="Hello";
	     System.out.println(s2);
	     
	     s2=s2.concat("World");
	     System.out.println(s2);
	     
	     System.out.println("---------------------------------------------");
	     
	     String str1= new String("Java");
	     str1=str1.concat("Programs");
	     System.out.println(str1);

	}

}
