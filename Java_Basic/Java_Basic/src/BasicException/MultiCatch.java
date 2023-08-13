
package BasicException;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			int a[] = { 4, 5, 6 };

			System.out.println(a[4] / 0);
		}
		
		catch (NullPointerException e) {
			System.out.println("Null");
		}
		 catch(IndexOutOfBoundsException e1)
		 {
		 System.out.println(e1);
		 }
		catch (ArithmeticException e2) {
			System.out.println("/Zero");
		} 

		

	}

}
