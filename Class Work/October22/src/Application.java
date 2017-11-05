
public class Application {

	public static void main(String[] args) {
		/* System.out.println("October 22"); */

		/*
		 * int tablecount = 20; int x; int tableno = 8; for( x = 1; x <= tablecount ;
		 * x=x+1) { int result = tableno * x; System.out.println(tableno + " * " + x +
		 * " = " + result);
		 */

		Student s1 = new Student("Sahil");
		s1.readBook("Harry Potter");
		s1.readBook("Harry Potter",30);
		s1.readBook("Harry Potter",30,40);
		

	}

}
	