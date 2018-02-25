
public class Application {

	public static void main(String[] args) {

		Student s = new Student("Pranav");
		Student s1 = new Student();
		int min = s1.play(Game.Soccer);
		System.out.println(min + " minutes");
		int minute = s1.play2(1);
		System.out.println(minute + " minutes");

	}

}
