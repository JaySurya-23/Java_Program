package BasicException;

class NegativeNumberException extends Exception {
	
	public NegativeNumberException() 
	{
		super();
	}

	public NegativeNumberException(String msg) {
		super(msg);
	}
}

public class CustomException {

	public static void findPower(int base, int expo) throws NegativeNumberException {
		int power = 1;
		if (expo < 0) {
			throw new NegativeNumberException("Invalid expo ");
		} else {
			for (int i = 1; i <= expo; i++) {
				power = power * base;
			}

		}

		System.out.println(power);
	}

	public static void main(String[] args) {
		

		try {
			CustomException.findPower(2, -3);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Handled");
	}


	}


