package com.Polymorphism;

class Menu

{
	
	private int m_id;
	private String m_name;
	private int price;
	
	public void setM_id(int m_id)
	{
		this.m_id=m_id;
	}
	
	public void setM_name( String m_name)
	{
		this.m_name=m_name;
	}
	
	public void setPrice(int Price)
	{
		this.price=price;
	}
	
	public int getM_id()
	{
		return m_id;
	}
	
	public String getM_name()
	{
		return m_name;
		
	}
	
	public int getPrice()
	{
		return price;
	}

}

public class Hotel {

	private int h_id;
	private String h_name;
	private Menu menuitem;
	
	
	public void setH_id(int h_id)
	{
		this.h_id=h_id;
	}
	
	public void setH_name(String h_name)
	{
		this.h_name=h_name;
	}
	
	public void setMenuitem(Menu menuitem)
	{
		this.menuitem=menuitem;
	}
	
	public int getH_id()
	{
		return h_id;
	}
	
	public String getH_name()
	{
		return h_name;
	}
	
	public Menu getMenuitem()
	{
		return menuitem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel h=new Hotel();
		h.setH_id(1);
		h.setH_name("The Leela");
		h.setMenuitem(new Menu());
		
		Menu m=h.getMenuitem();
		m.setM_id(10);
		m.setM_name("sweet");
		m.setPrice(150);
		
		System.out.println("Hotel id :"+h.getH_id());
		System.out.println("Hotel Name is :"+h.getH_name());
		System.out.println("Menu ID :"+m.getM_id());
		System.out.println("Menu  : "+m.getM_name());
		System.out.println("Price = "+m.getPrice());
		
		
	

	}

}
