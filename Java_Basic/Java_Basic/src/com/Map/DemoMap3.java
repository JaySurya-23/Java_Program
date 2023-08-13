package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//create a map which containt actorname as key and list of movie name as value in which 
//that actor perform role
class Movie {
	int mid;
	String mname;
	String actorname;

	public Movie(int mid, String mname, String actorname) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.actorname = actorname;
	}

	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", actorname=" + actorname + "]";
	}

}


public class DemoMap3 {

	public static void main(String[] args) {
		
		ArrayList<Movie> m = new ArrayList<>();
		m.add(new Movie(1, "HarryPotter", "Mery"));
		m.add(new Movie(2, "LordOfTheRings", "John"));
		m.add(new Movie(3, "100Days", "Mery"));
		m.add(new Movie(4, "Narnia", "Wilson"));
		m.add(new Movie(5, "ShreLockHome", "John"));

		for (Movie e : m) {
			System.out.println(e);
		}

		HashMap<String, ArrayList<String>> hm = new HashMap();

		ArrayList<String> listOfmovie = new ArrayList();
		
		Iterator<Movie> itr = m.iterator();
		while (itr.hasNext()) {
			Movie movie = itr.next();
			if (hm.containsKey(movie.actorname)) {
				listOfmovie = hm.get(movie.actorname);
				listOfmovie.add(movie.mname);
			} else {
				listOfmovie = new ArrayList<>();
				listOfmovie.add(movie.mname);

			}
			hm.put(movie.actorname, listOfmovie);
		}

		System.out.println("........................");

		for (Map.Entry<String, ArrayList<String>> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}


	}

}
