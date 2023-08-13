package BasicException;

class String_Exception extends Exception {

	public String_Exception()
	{
		super();
	}
	public String_Exception(String string) {
		super(string);
	}
	


}
public class Custome_Exception {
	 
	public static void String_check(String str) throws String_Exception 
	{
	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				throw new String_Exception("Invalid String");
			}
		}
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		
	    	String str="jay12";
	    	
	    	try {
				Custome_Exception.String_check(str);
			} catch (String_Exception e) {
				
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}
}
