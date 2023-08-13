package BasicException;

import java.util.Scanner;

class NumbernotEven extends RuntimeException
{
	public NumbernotEven()
	{
		super();
	}
	
	public NumbernotEven(String msg)
	{
		super(msg);
	}
}

public class EvenOddCheck {
	
	public static void numbercheck(int a) 
	{
		if(a%2!=0)
		{
			throw new NumbernotEven("not even");
		}
		System.out.println("Even "+a);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try
		{
			numbercheck(a);
		} 
		catch (NumbernotEven e) {
			System.out.println(e);
		}
		
	}

}
