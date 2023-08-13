package com.Practice;


class BalanceException extends Exception
{
	public  BalanceException()
	{
		super();
	}
	
	public  BalanceException(String msg)
	{
		super(msg);
	}
}

public class Balance_check_exception {
	
	public static void check(int  balance) throws BalanceException
	{
		
		if(balance<1000)
		{
			throw new BalanceException ("intvalid balance");
			
		}
		else
		{
			System.out.println("valid");
		}
	}

	public static void main(String[] args) {
		
		int balance=900;
		
		try
		{
			Balance_check_exception.check(balance);
		} 
		
		catch(Exception e)
		{
			System.out.println(e);
		}
       
	}

}
