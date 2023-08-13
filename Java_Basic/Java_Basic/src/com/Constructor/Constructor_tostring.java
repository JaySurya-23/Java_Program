package com.Constructor;

public class Constructor_tostring {
	
	int id;
	String name;
	
	public Constructor_tostring(int id,String name) {
		
		this.id=id;
		this.name=name;	
	}
	
	public String toString()
	{
		return id+""+name;
		
	}

	public static void main(String[] args) {
		
		Constructor_tostring c=new Constructor_tostring(10, " jay");
        System.out.println(c);
	}

}
