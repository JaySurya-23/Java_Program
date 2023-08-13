package com.Constructor;

public class Account {

	
	  public   long account_no;
      public   String coustmer_name;
			
			public Account()
			{
				System.out.println("defalut constructor");				
			}
			
			public Account(int a,int b)
			{
				System.out.println("parameterized method");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		Account a=new Account(10, 10);
		
	   

	}

}
