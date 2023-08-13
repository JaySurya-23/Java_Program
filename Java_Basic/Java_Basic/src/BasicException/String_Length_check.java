package BasicException;


class InvalidNumber extends Exception 
{
	public InvalidNumber() {
		super();
	}
	
	public InvalidNumber(String num)
	{
		super(num);
	}
	
class Invalidigitlength extends Exception
	{
		public Invalidigitlength()
		{
			super();
		}
		
		public Invalidigitlength(String msg)
		{
			super(msg);
		}
	}
	
	
}

public class String_Length_check {
	
	public static void length(String str) throws InvalidNumber
	{
	    int count=0;	
	    int digit = 0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)>='0'&& str.charAt(i)<='9')
			{
				count++;
			}
			
			
			else if(digit !=count)
			{
				throw new InvalidNumber("Invalid Number");
			}
				
		}
		
		int fnum=0;
		int lnum=0;
		int k=str.length()-1;
		
		for(int i=0;i<3;i++)
		{
			fnum=fnum+(str.charAt(i)-48);
			
		}
		
		
		for(int j=0;j<3;j++)
		{
			lnum=lnum+(str.charAt(k)-48);
			k--;
		}
		
		System.out.println(fnum+" "+lnum);
	}
	
	public static void main(String[] args) {
		
		String str="123546123";
		try {
			String_Length_check.length(str);
		} catch (InvalidNumber e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
