import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		
		System.out.print("first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
			
		for( int x = 1 ; x <= 10 ; x = x + 1) {
			System.out.println( firstNumber * x);
		}
	
	
	}

}



