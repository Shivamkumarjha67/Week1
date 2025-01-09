import java.util.Scanner;

public class PriceCalculation {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of unit price and quantity
		System.out.println("Enter price each : ");
		int unitPrice = input.nextInt();
		int quantity = input.nextInt();

		// Calculating the total price
		int totalAmount = unitPrice * quantity;

		System.out.println("Total purchase price in INR " + totalAmount + " if the quantity is " + quantity + " and the unit Price is " + unitPrice);
	
		// closing the scanner resource
		input.close();
	}
}