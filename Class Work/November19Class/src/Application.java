
public class Application {

	public static void main(String[] args) {

		/*
		  int result = Math.addNum(3, 5); 
		  System.out.println("The sum is " + result);
		 */

		Math m = new Math();
		int result = m.addSpecial(3);
		System.out.println(result);
		int r = m.addSpecial(4);
		System.out.println(r);
		int f = m.addSpecial(7);
		System.out.println(f);

		Math m2 = new Math();
		int Q = m2.addSpecial(3);
		System.out.println(Q);
		int w = m2.addSpecial(4);
		System.out.println(w);
		int e = m2.addSpecial(7);
		System.out.println(e);

		int t = m.addSpecial(4);
		System.out.println(t);
	
		Dog d = new Dog();
		d.feed();
	
	
	
	
	 
	
	}

}
