import java.util.Scanner;

public class ChocolateDistribution {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of chocolate and children : ");
		
		// Taking input of number of chocolate and number of children
		int numberOfChocolate = input.nextInt();
		int numberOfChildren = input.nextInt();

		// Finding the number of chocolate given to each children
		int chocolateToEach = numberOfChocolate / numberOfChildren;

		// Finding the number of left chocolate
		int chocolateLeft = numberOfChocolate % numberOfChildren;

		System.out.println("The number of chocolates each child gets is " + chocolateToEach + " and the number of remaining chocolates are " + chocolateLeft);

		// closing the scanner resource
		input.close();
	}
}