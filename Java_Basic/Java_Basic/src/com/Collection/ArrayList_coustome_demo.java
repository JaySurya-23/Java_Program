package com.Collection;

import java.util.ArrayList;

//calculate the total bill for the given menu from order typeof list oder contain id,menu name,qty,price


class Order
{
	int oid;
	String Mname;
	int qty;
	double price;
	public Order(int oid, String mname, int qty, double price) {
		super();
		this.oid = oid;
		Mname = mname;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", Mname=" + Mname + ", qty=" + qty + ", price=" + price + "]";
	}
	
}
public class ArrayList_coustome_demo {

	public static void main(String[] args) {
		ArrayList<Order>al=new ArrayList<>();
		al.add(new Order(1, "dosa", 2, 40));
		al.add(new Order(2, "pavbhaji", 1, 70));
		al.add(new Order(3, "dosa", 3, 40));
		
		
		double totalbill=0;
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).Mname.equals("dosa"))
			{
				totalbill=al.get(i).qty*al.get(i).price;
			}
		}
		System.out.println(totalbill);

	}

}
