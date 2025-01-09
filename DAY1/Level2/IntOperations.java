import java.util.Scanner;

public class IntOperations {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number of person
		System.out.println("Enter the three number : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		// Performing the different arithmetic operations
		int operation1 = a + b * c;
		System.out.println("Result of operation a + b * c : " + operation1);

		int operation2 = a * b + c;
		System.out.println("Result of operation a * b + c: " + operation2);

		int operation3= c + a / b;
		System.out.println("Result of operation c + a / b : " + operation3);

		int operation4 = a % b + c;
		System.out.println("Result of operation a % b + c : " + operation4);

		// closing the scanner resource
		input.close();
	}
}