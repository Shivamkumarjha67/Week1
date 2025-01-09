import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		// Condition for checking the number
		if(num > 0) {
			System.out.println("positive");
		} else if(num < 0) {
			System.out.println("negative");
		} else {
			System.out.println("Zero");
		}

		// closing the scanner resource
		input.close();
	} 
}