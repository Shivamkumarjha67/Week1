import java.util.Scanner;

public class TriangularPark {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Enter all sides of triangle : ");
		
		// Taking all sides as input
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();

		// Finding the number of rounds required to travel 5 kms
		int sumOfAllSides = side1 + side2 + side3;
		int numberOfRounds = (5 * 1000) / sumOfAllSides;

		System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");

		// closing the scanner resource
		input.close();
	}
}