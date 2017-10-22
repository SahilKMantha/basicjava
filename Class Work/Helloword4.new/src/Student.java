
public class Student {
	String name;
	String nameBook;

	Student(String inputname) {
		name = inputname;
	}

	public void DoHomework() {
		System.out.println("Doing Homework");
	}

	int readBook(String Bookname){
		System.out.println("It took 30 minutes to read " + Bookname);
		return 20;
	}
}