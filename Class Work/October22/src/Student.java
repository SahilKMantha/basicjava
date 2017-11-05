
public class Student {

	String name;
	String Bookname;
	int minutesread;
	int pagesread;

	Student(String input) {
		name = input;

	}

	void readBook(String Bookname) {
		System.out.println("I am reading " + Bookname);
	}
		
	void readBook(String Bookname, int minutesread) {
		System.out.println("I am reading " + Bookname + " and have read for " + minutesread + " minutes");
	}
	void readBook(String Bookname, int minutesread, int pagesread) {
		System.out.println("I am reading " + Bookname +" and have read for " + minutesread + " minutes" +  " and have read " + pagesread + " pages" );
}
	
	
		
	
	}
	



