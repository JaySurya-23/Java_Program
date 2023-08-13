package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

class Moviess implements Comparable<Moviess>
{
	int id;
	String mName;
	float rating;
	
	public Moviess(int id, String mName, float rating) {
		this.id = id;
		this.mName = mName;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", mName=" + mName + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Moviess o) {
		
		//return (int) (o.rating-this.rating);
		return (int) (this.rating-o.rating);
	}
	
	
	
	
}
public class Comparable1 {

	public static void main(String[] args) {
		
		ArrayList<Moviess>ml=new ArrayList<Moviess>();
		
		ml.add(new Moviess(101,"RRR",5.4f));
		ml.add(new Moviess(103,"96",5.3f));
		ml.add(new Moviess(102,"Jack Rayn",5.1f));
		
		for(Moviess m:ml)
		{
			System.out.println(m);
		}
		System.out.println(".......................");
		
		Collections.sort(ml);
		
		for(Moviess m3:ml)
		{
			System.out.println(m3);
		}
			
		

	}

}
