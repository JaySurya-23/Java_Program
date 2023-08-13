package com.Abstraction;

abstract class Card {
	int x;

	static int rate;

	public Card(String type)// Create constractor 
	{
		System.out.println("This is Card " + type);
	}

	abstract void showInvitation();

	public void showPrice()//concrete method
	{
		System.out.println("300");
	}

}

class BirthdayCard extends Card {

	BirthdayCard() 
	{
		super("Magic");
	}

	void showInvitation() {

		System.out.println("Hi this is birthday card");
	}

}

class AnniversaryCard extends Card {
	
	AnniversaryCard() 
	{
		super("magic");
	}

	
	void showInvitation() {
		System.out.println("Hi this is Anniversary");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Card c = new BirthdayCard();
		c.showInvitation();
		c.showPrice();

	}

}
