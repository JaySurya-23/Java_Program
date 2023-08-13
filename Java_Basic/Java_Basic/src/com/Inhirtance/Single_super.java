package com.Inhirtance;


class Mobile{
	
	 String company="Apple";
	 
	 public void divce()
	 {
		 System.out.println("mobile company ");
	 }
}

    class Details extends Mobile{
    	
    	String company="Nokiya";
    	
    	public void Showdatils()
    	{
    		super.divce();
    		System.out.println("ram=4gb "+super.company);
    	}
    	
    	
    	
    }
public class Single_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Details d=new Details();
         d.Showdatils();
	}

}
