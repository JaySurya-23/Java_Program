package com.Practice;

public class Account {
     int accountNumber;
     String accountHolderName;
     double accountBalance;

    public void insert(int number, String name, double balance) {
        accountNumber = number;
        accountHolderName = name;
        accountBalance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount)
    {
        if (accountBalance < amount)
        {
            System.out.println("Insufficient Balance");
        }
        
        else 
        {
            accountBalance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    public void check_balance() {
        System.out.println("Current Balance: " + accountBalance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Account account = new Account();
	        account.insert(123456, "JAY", 1000.0);
	        account.display();
	        account.deposit(500.0);
	        account.check_balance();
	        account.withdraw(2000.0);
	        account.check_balance();

	}

}
