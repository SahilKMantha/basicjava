import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		System.out.print("first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		if(firstNumber % 2 == 0) {
			System.out.print( firstNumber + " is even ");
		}else {
			System.out.println( firstNumber + " is odd ");
		}
		
	
	
		
	}

}
