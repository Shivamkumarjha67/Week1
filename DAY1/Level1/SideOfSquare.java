import java.util.Scanner;

public class SideOfSquare {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner sc = new Scanner(System.in);
		
		// taking the input as perimeter of square
		System.out.println("Enter the perimeter of the square : ");
		float perimeter = sc.nextFloat();

		// Calculating the side of the square
		float side = perimeter / 4;

		System.out.println("The length of side is " + side + " whose perimeter is " + perimeter);

		sc.close();
	}
}