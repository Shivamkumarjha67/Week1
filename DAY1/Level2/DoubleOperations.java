import java.util.Scanner;

public class DoubleOperations {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number of person
		System.out.println("Enter the three double number (a, b, c) : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Performing the different arithmetic operations
		double operation1 = a + b * c;
		double operation2 = a * b + c;
		double operation3 = c + a / b;
		double operation4 = a % b + c;

		System.out.println("Result of Double operations are : " + operation1 + " , " + operation2 + " , " + operation3 + " , " + operation4);

		// closing the scanner resource
		input.close();
	}
}