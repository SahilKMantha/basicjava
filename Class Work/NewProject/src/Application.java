
public class Application {

	public static void main(String[] args) {

		Person p1 = new Person("Sahil", 14);
		Person p2 = new Person("Nikhil", 10);
		boolean canDrive = p1.canDrive();

		if (canDrive) {
			System.out.println("Can drive");
		} else {
			System.out.println("Cannot drive");

		}
	}
}
/* comments are good to show what some code will do or to write some notes */
