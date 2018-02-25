
public class Application {

	public static void main(String[] args) {

		Student s = new Student();
		s.EatFruit(1);
		s.EatFruit(2);
		s.EatFruit(79);
		s.EatFruit(Fruit.Apple);
		s.EatFruit(Fruit.Bananna);
		s.EatFruit(EnumTest.Fruit.Grape);
		
	}

}
