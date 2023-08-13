package com.Array;

import java.util.Arrays;
import java.util.Scanner;

class InfoStudent {
	 
	 int id;
	 String sName;
	 int[] mark;
	 double per;
	 
	 public InfoStudent(int id,String sName,int[] mark,double per)
	 {
		 
		 this.id=id;
		 this.sName=sName;
		 this.mark=mark;
		 this.per=per;
		 
	 }
	 
	 public String toString()
	 {
		return id+" "+ sName+" "+Arrays.toString(mark)+" "+per;
		 
	 }
	
}

public class Arrayobject2 {

	public static void main(String[] args) {
	    
		InfoStudent[] s=new InfoStudent[3];
		Scanner sc=new Scanner(System.in);
		
		double per=0;
		for(int i=0;i<s.length;i++)
		{
			int sum=0;
			System.out.println("enter student ID");
			int id=sc.nextInt();
			System.out.println("Enter Student Name");
			String name=sc.next();
			System.out.println("Enter the Subject of marks");
			int mark[]=new int[5];
			
			for(int j=0;j<mark.length;j++)
			{
				mark[j]=sc.nextInt();
				sum=sum+mark[j];
				per=(sum/500)*100;

			}	  
			
			s[i]=new InfoStudent(id, name, mark,per);	
			  	
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
	
	  
	}
	 

}
