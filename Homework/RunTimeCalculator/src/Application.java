import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.print("Number of Laps:");
		Scanner scanner = new Scanner(System.in);
		int laps = scanner.nextInt();

		System.out.print("Time For Each Lap in Minutes:");
		int time = scanner.nextInt();

		System.out.print("Total Time Taken for All Laps = " + laps * time + " minutes");
	
	}

}
