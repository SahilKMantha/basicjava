import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.print("Grade:");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();

		if( grade < 5) {
			System.out.print(" Elementary School");
		}else if (grade >= 6 && grade <= 8) {
			System.out.print("Middle School");
		}else if( grade >= 9 && grade <= 12) {
			System.out.print("High School");
		}else {
			System.out.print("College");
		}
}
}