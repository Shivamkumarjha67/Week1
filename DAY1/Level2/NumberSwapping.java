import java.util.Scanner;

public class NumberSwapping {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of both number
		System.out.println("Enter the two number num1 and num2 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		// Swapping both number without third variable
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;

		System.out.println("Swapped number num1 and num2 are : " + num1 + " and " + num2);

		// closing the scanner resource
		input.close();
	}
}