package BasicException;

public class Finally {

	public static void main(String[] args) {
		
		
		try
		{
			System.out.println(10/0);
			System.out.println("hii");
			
		}
		catch  (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
		
		System.out.println("All done");

	}

}
