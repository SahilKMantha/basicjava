
public class Student {

	void EatFruit(int fruit) {

		if (fruit == 1) {
			System.out.println("Eating Apple");
		} else if (fruit == 2) {
			System.out.println("Eating Bananna");
		} else {
			System.out.println("Not Eating Fruit");
		}

	}

	void EatFruit(EnumTest.Fruit f) {
		System.out.println("Eating " + f);
	}
}
