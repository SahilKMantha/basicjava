
public class Application {

	public static void main(String[] args) {
		Car c1 = new Car();
			c1.Model = "Camry";
			c1.Company = "Toyota";
			c1.year = 2017;
			c1.Tires = "Bridgestone";
			
			System.out.println(c1.Model);
			System.out.println(c1.Company);
			System.out.println(c1.year);
			System.out.println(c1.Tires);
			
		Car c2 = new Car();
			c2.Model = "Civic";
			c2.Company = "Honda";
			
			System.out.println(c2.Model);
	}

}
