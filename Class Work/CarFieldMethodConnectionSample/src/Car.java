
public class Car {
	boolean started;

	String name;
	int horsePower;

	void start() {
		if (started) {
			System.out.println("sorry you have started already. you need to stop before starting again");
		} else {
			System.out.println("starting : " + name + " which has:" + horsePower + " horse power");
			started = true;
		}

	}

	void stop() {
		if (started) {
			System.out.println("stopping: " + name);
			started = false;
		} else {
			System.out.println("sorry,  you have not started yet. please start the car before stopping");
		}
	}
}
