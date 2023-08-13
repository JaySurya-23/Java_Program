package com.oops;

public class Movie_Ticket {

	int movie_id;
	String movie_name;
	int Ticket_cost;
	int No_of_ticket;
	int total_ticket;
	int avl = 10;

	public void moviedetails(int id, String name, int cost, int no_ticket) {
		movie_id = id;
		movie_name = name;
		Ticket_cost = cost;
		No_of_ticket = no_ticket;

	}

	public void calculate_bill() {
		total_ticket = No_of_ticket * Ticket_cost;
		avl = avl - No_of_ticket;

	}

	public void display() {
		System.out.println(
				movie_id + " " + movie_name + " " + Ticket_cost + " " + No_of_ticket + " " + total_ticket + "  " + avl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_Ticket mt = new Movie_Ticket();
		mt.moviedetails(1, "John wick", 240, 6);
		mt.calculate_bill();
		mt.display();

	}

}
