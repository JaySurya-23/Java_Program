package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Items
{
		int iID;
		String iName;
		int Iprice;
		public int getiID() {
			return iID;
		}
		public void setiID(int iID) {
			this.iID = iID;
		}
		public String getiName() {
			return iName;
		}
		public void setiName(String iName) {
			this.iName = iName;
		}
		public int getIprice() {
			return Iprice;
		}
		public void setIprice(int iprice) {
			Iprice = iprice;
		}
		
}

class Supplier{
	int sId;
	String sName;
	Items item;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	
	
}

public class Supplier_contain {

	public static void main(String[] args) {
		
		
		ArrayList<Supplier>sp=new ArrayList<Supplier>();
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<3;i++)
		{
			System.out.println("Enter the Supplier ID");
			int ids=sc.nextInt();
			System.out.println("enter the Supplir Name");
			String names=sc.next();
			System.out.println("Enter the Items id");
			int id=sc.nextInt();
			System.out.println("enter the Items Name");
			String name=sc.next();
			System.out.println("Enter price");
			int p=sc.nextInt();
			
			Supplier s=new Supplier();
			s.setsId(ids);
			s.setsName(names);
			s.setItem(new Items());
//			Items it=s.getItem();
//			it.setiID(id);
//			it.setiName(name);
//			it.setIprice(p);
			s.getItem().setiID(id);
			s.getItem().setiName(name);
			s.getItem().setIprice(p);
			
			sp.add(s);
			
		}
		
//		Iterator<Supplier>sl=sp.iterator();
//		while(sl.hasNext())
//		{
//			Supplier lier=sl.next();
//			System.out.println(lier.getsId()+""	 );
//		}

		for(Supplier spl:sp)
		{
			if(spl.getItem().getIprice()>1000)
			{
			System.out.println(spl.getsId()+" "+spl.getsName()+" "+spl.getItem().getiID()+
					" "+spl.getItem().getiName()+" "+spl.getItem().getIprice());
			}
		}
	}

}
