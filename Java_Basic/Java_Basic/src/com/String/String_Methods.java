package com.String;

public class String_Methods {

	public static void main(String[] args) {
		

	      String str="Programs";
	      
	      System.out.println("Length:"+str.length()); // number of characters
	      
	      //charAt
	      
	      System.out.println(str.charAt(7)); // index: 0 to 7
	      
	      System.out.println(str.charAt(str.length()-1));
	      
	      //substring
	      
	      System.out.println("Substring: "+str.substring(1,4)); // prints 1 and 2
	       
	      //contains
	      
	      System.out.println("Contain gra: "+ str.contains("gra"));//check string valid or not
	      
	      //indexOf
	      
	      System.out.println("Index:"+str.indexOf("ro"));
	      
	      System.out.println("Index:"+str.indexOf('r'));
	      
	      System.out.println("Index:"+str.indexOf('y',3));
	      
	      System.out.println("Index:"+str.lastIndexOf('r'));
	      
	      // uppercase and lowercase
	      
	      System.out.println("UpperCase:"+str.toUpperCase());
	      
	      System.out.println(str);
	      
	      System.out.println("LowerCase:"+str.toLowerCase());
	      
	      // empty
	      
	      System.out.println(str.isEmpty());
	      
	     // String s1=null;  // Exception
	      
	      String s1="";
	      
	      System.out.println(s1.isEmpty());
	      
	      // replace
	      
	      System.out.println(str.replace('r','t'));
	      
	      System.out.println(str);
	      
	      

	}

}
