package com.String;

import java.util.Arrays;

public class String_length {


	public static void main(String[] args) {
		
		String str="Jay";
		String str1=" suryawanshi";
		String str3;
		str3=str;
		System.out.println(str3);
		System.out.println(str.length());
		
		System.out.println(str.concat(str1));
		
		System.out.println(str.compareTo(str1));
		
		String s="Hello$jay";
		
		String[] s1=s.split("\\$");
		
		for(String token:s1)
		System.out.println(token);

	}

}
