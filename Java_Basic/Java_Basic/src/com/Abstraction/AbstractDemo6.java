package com.Abstraction;

abstract class Mobile

{  
	Mobile()
	{
	
	}
	
	Mobile(int i)
	{
		System.out.println("Constractor"+i);
	}
  
	void showFeartures()
	{
		System.out.println("Mobile Feartures");
	}
	abstract void latestFeatures();
	
}

class Samsung extends Mobile
{
	Samsung()
	{
		super();
	}
	void latestFeatures()
	{
		System.out.println(".................");
	}
}


public class AbstractDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Samsung m=new Samsung();
        m.latestFeatures();
        m.showFeartures();
	}

}
