
public class Application {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
				int sum = c1.add(3, 6);
				int sum2 = c1.add(4, 10);
				int sum3 = c1.add(5, 7);
				System.out.println("Addition:");
				System.out.println("3 + 6 = " + sum);
				System.out.println("4 + 10 = " + sum2);
				System.out.println("5 + 7 = " + sum3);
				
		Calculator c2 = new Calculator();
				
				int math = c2.multiply(3,4);
				int math2 = c2.multiply(4,3);
				int math3 = c2.multiply(5,8); 
				
				
				System.out.println("");
				System.out.println("Multiplication");
				System.out.println("3 * 4 = " + math);
				System.out.println("4 * 3 = " + math2);
				System.out.println("5 * 8 = " + math3);
	}

	
	
	
	
	
	
}
