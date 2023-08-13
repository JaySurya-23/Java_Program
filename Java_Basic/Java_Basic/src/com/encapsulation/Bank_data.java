package com.encapsulation;

public class Bank_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAcc_datils b=new BankAcc_datils();
		b.setAcc_no(35108795);
		b.setAcc_type("Saving");
		b.setCus_name("Jay Suryawanshi");
		b.setBalance(15000);
		
		System.out.println("Account number :"+b.getAcc_no());
		System.out.println("Account type :"+b.getAcc_type());
		System.out.println("Coustmer Name :"+b.getCus_name());
		System.out.println("Account Balance :"+b.getBalance());
		

	}

}
