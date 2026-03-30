package PractiseQuetions;

public class MainClassforLibraryBook {
	    public static void main(String[] args) {
	        LibraryBook book1 = new LibraryBook(101, "Mrutyunjay", "Shivaji Sawant");
	        LibraryBook book2 = new LibraryBook(102, "Shyamchi Aai", "Sane Guruji");
	        LibraryBook book3 = new LibraryBook(103, "Chaava", "Shivaji Sawant");

	        System.out.println("--- Library Catalog ---");
	        book1.display();
	        book2.display();
	        book3.display();
	    }
	}


