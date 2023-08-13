package com.Practice;

public class Opreator {

	  public int add(int num1, int num2) {
	        return num1 + num2;
	    }

	    public int subtract(int num1, int num2) {
	        return num1 - num2;
	    }

	    public int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    public double divide(double num1, double num2) {
	        return num1 / num2;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Opreator operations = new Opreator();
	        int sum = operations.add(10, 20);
	        int difference = operations.subtract(30, 15);
	        int product = operations.multiply(5, 6);
	        double quotient = operations.divide(25.0, 5.0);
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);

	}

}
