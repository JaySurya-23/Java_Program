package com.Static;

public class Addition {

	int a;
	static int b;
	static int sum;

	static void add(int x, int y) {
		Addition add = new Addition();

		add.a = x;
		Addition.b = y;
	    sum = add.a + add.b;
	}

	public void display() {	
	//	Addition add = new Addition();
		Addition.add(10, 10);
		System.out.println(sum);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a = new Addition();
		a.display();

	}

}
