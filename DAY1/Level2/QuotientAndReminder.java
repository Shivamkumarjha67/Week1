import java.util.Scanner;

public class QuotientAndReminder {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number of person
		System.out.println("Enter the two number : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		// Calculating the quotient
		int quotient = num1 / num2;

		// Calculating the reminder
		int reminder = num1 % num2;

		System.out.println("The quotient is " + quotient + " and Reminder is " + reminder + " of two number " + num1 + " and " + num2);
		
		// closing the scanner resource
		input.close();
	}
}