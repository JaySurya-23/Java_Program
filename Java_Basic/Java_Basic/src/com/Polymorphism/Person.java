package com.Polymorphism;



// containment using constructor

class Address{
	
	int pincode;
	String city;
	
	public Address(int pincode,String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	 public void Showadr()
	 {
		 System.out.println(pincode+" "+city);
	 }
	 
	 public String toString()
		{
			return pincode+" "+city;
		}
	
}

public class Person {
	
	
	int id;
	String name;
	Address adr;
	
	public Person(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	
	public void Show()
	{
		System.out.println(id+" "+name);
		adr.Showadr();
	}
	
	public String toString()
	{
		return id+" "+name+" "+adr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person(1, "Jay", new Address(424005,"Dhule"));
		System.out.println(p);

	}

}
