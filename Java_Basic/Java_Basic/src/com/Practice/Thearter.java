package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

class Move{
	
	private String m_name;
	private double rating;
	
	public String getM_name() {
		return m_name;
	}
	
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return m_name+" "+rating;
	}
	
	
	
	
}

public class Thearter {
	
	
	private int T_id;
	private String T_name;
	private Move m;
	
	
	
	public int getT_id() {
		return T_id;
	}



	public void setT_id(int t_id) {
		T_id = t_id;
	}



	public String getT_name() {
		return T_name;
	}



	public void setT_name(String t_name) {
		T_name = t_name;
	}



	public Move getM() {
		return m;
	}



	public void setM(Move m) {
		this.m = m;
	}
	public String toString() {
		return T_id+" "+T_name+" "+m;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);	
		Thearter tr[]=new Thearter[2];
	    float rate=0;
		for(int i=0;i<tr.length;i++) {
			
			System.out.println("Enter Thearter ID ");
			int tid=sc.nextInt();
			System.out.println("Enter Thearter Name");
			String tname=sc.next();
			System.out.println("Enter Movie Name");
			String mname=sc.next();
			System.out.println("Enter moive rating ");			
			 rate=sc.nextFloat();
			
			
			Thearter t=new Thearter();
			t.setT_id(tid);
			t.setT_name(tname);
			t.setM(new Move());
			t.getM().setM_name(mname);
	        t.getM().setRating(rate);
					
			tr[i]=t;
			
		}
		
		System.out.println(Arrays.toString(tr));
//		
//		for(int i=0;i<tr.length;i++)
//		{
//			if(tr[i].getM().getRating()>8)
//				
//		    System.out.println(tr[i].getM().getRating()+" "+tr[i].getM().getM_name());
//		}
		
		
		//sort rating 
		
		for(int i=0;i<tr.length;i++)
		{
			for(int j=i+1;j<tr.length;j++)
			{
				if(tr[i].getM().getRating()<tr[j].getM().getRating())
				{
				Thearter temp=tr[i];
				tr[i]=tr[j];
				tr[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(tr));
		
//		Thearter t=new Thearter();
//		t.setT_id(1);
//		t.setT_name("pvr");
//		t.setM(new Move());
//		
//		Move m=t.getM();
//		m.setM_name("RRR");
//		m.setRating(8.5);
//		
//		System.out.println("Thearter ID : "+t.getT_id()+"Thearter name   "+t.getT_name());
//		System.out.println("Movie name   "+m.getM_name()+"movie rating  "+m.getRating());
		
			

	}

}
