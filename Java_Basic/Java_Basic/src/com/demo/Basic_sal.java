package com.demo;

public class Basic_sal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    double basicSalary = 50000;
	        double pf = basicSalary * 0.1;
	        double da = basicSalary * 0.11;
	        double hra = basicSalary * 0.2;
	        
	        double netsalary = basicSalary + pf + da + hra;
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("PF: " + pf);
	        System.out.println("DA: " + da);
	        System.out.println("HRA: " + hra);
	        System.out.println("Gross Salary: " + netsalary);

	}

}
