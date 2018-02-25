
public class Student {

	Student(String name) {

	}

	Student() {

	}

	int play(Game gametype) {
		if (gametype == Game.Basketball) {
			System.out.println("Play Basketball for");
			return 10;
		} else if (gametype == Game.Soccer) {
			System.out.println("Play Soccer for");
			return 10;
		} else {
			System.out.println("I dont know what to play");
			return 10;
		}
	}

	int play2(int gametype) {

		switch (gametype) {

		case 1:
			System.out.println("Play Basketball for ");
			break;
		case 2:
			System.out.println("Play Soccer for ");
			break;
		default:
			System.out.println("I dont know what to play");

		}
		return 10;

	}

}
