import java.util.Scanner;

public class TriangularPark {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input all sides
		System.out.println("Enter the size of side1 (in meter): ");
		int side1 = input.nextInt();
		
		System.out.println("Enter the size of side2 (in meter): ");
		int side2 = input.nextInt();
		
		System.out.println("Enter the size of side3 (in meter): ");
		int side3 = input.nextInt();
		
		// Calling method and printing the result as well
		System.out.println("Total number of rounds needed to make is " + getRounds(side1, side2, side3) + " inorder to complete 5 km running on the given sides of triangular park.");
		
		// closing the scanner resource
		input.close();
	}
	
	private static long getRounds(int side1, int side2, int side3) {
		int perimeter = side1 + side2 + side3;
		int rounds = (5000 % perimeter == 0) ? (5000 / perimeter) : (5000 / perimeter + 1);
		return rounds;
	}
}