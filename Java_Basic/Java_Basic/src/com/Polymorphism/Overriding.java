package com.Polymorphism;


 class over{

	 static int a;
	  public static  void show(int a)
	   {
		   System.out.println("Static method in overriding");
	   }
}   
	  
class Static extends over
{
	static int a;
       	
	   public static  void show(int a)
	   
	   {
		   
		  
		   System.out.println("override method");
	   }
}
  public class Overriding {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		over.show(10);
		Static.show(20);
	}


}