
public class Person {

	String name;
	int age;

	Person(String input, int inputage) {
		this.name = input;
		this.age = inputage;
	}

	boolean canDrive() {
		if (age >= 30) {
			return true;
		} else {
			return false;
		}
/* Constructor is a special method*/
	}

}
