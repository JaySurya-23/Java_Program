package com.Practice;

 class Kid {
    public void readBook() {
        System.out.println("Kid is reading a book");
    }

    public void readBook(String bookTitle, String authorName) {
        System.out.println("Kid is reading " + bookTitle + " by " + authorName);
    }
}

  class BigKid extends KidTest
  {
    public void readBook() {
        System.out.println("BigKid is reading a book");
 
    
    }
 }

public class KidTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Kid kid = new Kid();
	        kid.readBook();
	        kid.readBook("The Cat in the Hat", "Dr. Seuss");

	        BigKid bigKid = new BigKid();
	        bigKid.readBook();
	       
	}

}
