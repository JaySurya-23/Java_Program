package com.Inhirtance;

class Hotel {

	public void Hotel(int id, String name) {
		System.out.println(id + " " + name);
	}
}

class Staff extends Hotel {
	
	public void Staff() {
		System.out.println("Welcome");
	}
}

	

class Menu extends Staff

{
	public void Menu(String Dish_name)
	{
		System.out.println(Dish_name);
	}
}
	
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu s = new Menu();
		s.Hotel(1, "THE LEELA Hotel");
		s.Staff();
		s.Menu("Briyani");

	}

}
