
public class Application {

	public static void main(String[] args) {

		Student s1 = new Student("Sahil");
		Student s2 = new Student("Nikhil");
		s1.DoHomework();
		int minutesread = s1.readBook("Harry Potter");
		System.out.println(minutesread);
	}

}
