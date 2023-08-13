
package com.Polymorphism;

class Nib {

	private String n_type;
	private int n_price;

	public String getN_type() {
		return n_type;
	}

	public void setN_type(String n_type) {
		this.n_type = n_type;
	}

	public int getN_price() {
		return n_price;
	}

	public void setN_price(int n_price) {
		this.n_price = n_price;
	}

}

class Pen {
	private String p_name;
	private String p_colour;
	private int price;
	private Nib nibdatils;

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_colour() {
		return p_colour;
	}

	public void setP_colour(String p_colour) {
		this.p_colour = p_colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Nib getNibdatils() {
		return nibdatils;
	}

	public void setNibdatils(Nib nibdatils) {
		this.nibdatils = nibdatils;
	}
}

public class Bag {

	private String B_name;
	private String colour;
	private int price;
	private Pen pen;

	public String getB_name() {
		return B_name;
	}

	public void setB_name(String b_name) {
		B_name = b_name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bag b = new Bag();
		b.setB_name("skybag");
		b.setColour("red");
		b.setPrice(1200);
		b.setPen(new Pen());

		Pen p = b.getPen();
		p.setP_name("cello");
		p.setP_colour("blue");
		p.setPrice(12);
		p.setNibdatils(new Nib());

		Nib n = p.getNibdatils();
		n.setN_price(10);
		n.setN_type("cricle");

		System.out.println(" Bag Brand " + b.getB_name());
		System.out.println("Bag colour " + b.getColour());
		System.out.println("Bag Price = " + b.getPrice());
		System.out.println("Pen name " + p.getP_name());
		System.out.println("Pen colour " + p.getP_colour());
		System.out.println("Pen price " + p.getPrice());
		System.out.println("Nib price " + n.getN_price());
		System.out.println("Nib type " + n.getN_type());

	}

}
