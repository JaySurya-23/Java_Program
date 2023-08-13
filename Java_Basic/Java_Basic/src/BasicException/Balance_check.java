package BasicException;

class BalanceInsufficient_Exception extends Exception {
	public BalanceInsufficient_Exception() {
		super();
	}

	public BalanceInsufficient_Exception(String msg) {
		super(msg);
	}

}

public class Balance_check {

	public static void balanceCheck(int balance) throws BalanceInsufficient_Exception  {

		if (balance < 1000) {
			throw new BalanceInsufficient_Exception("Invalid Balance");
		}

		else {

			System.out.println("Balance is valid");

		}

	}

	public static void main(String[] args) {

		String name = "jay";
		System.out.println(name);
		int balance = 999;

		try {
			Balance_check.balanceCheck(balance);

		} catch (Exception e) {

			System.out.println(e);

		}

	}

}
