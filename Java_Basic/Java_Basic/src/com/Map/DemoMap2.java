package com.Map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Menu {
	int mid;
	String Mname;
	int price;

	public Menu(int mid, String mname, int price) {
		super();
		this.mid = mid;
		Mname = mname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", Mname=" + Mname + ", price=" + price + "]";
	}

}

class Order {
	int Oid;
	int Menuid;
	int qty;

	public Order(int oid, int menuid, int qty) {
		super();
		Oid = oid;
		Menuid = menuid;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Order [Oid=" + Oid + ", Menuid=" + Menuid + ", qty=" + qty + "]";
	}

}

public class DemoMap2 {

	public static void main(String[] args) {

		ArrayList<Menu> ml = new ArrayList<>();
		ml.add(new Menu(1, "Tea", 12));
		ml.add(new Menu(2, "Veda", 20));
		ml.add(new Menu(3, "Dosa", 50));

		ArrayList<Order> ol = new ArrayList<>();
		ol.add(new Order(10, 1, 2));
		ol.add(new Order(11, 2, 3));
		ol.add(new Order(12, 2, 2));
		ol.add(new Order(14, 3, 2));

		HashMap<String , Integer>hm=new HashMap<>();
		for (int i = 0; i < ml.size(); i++) {
			int totalbill = 0;
			for (int j = 0; j < ol.size(); j++) {

				if (ml.get(i).mid == ol.get(j).Menuid) {
					totalbill = totalbill + ml.get(i).price * ol.get(j).qty;

				}
			}
			System.out.println(ml.get(i).Mname + " " + totalbill);
			
			hm.put(ml.get(i).Mname, totalbill );
		}
            System.out.println("................................");
		    System.out.println(hm);
	}

}
