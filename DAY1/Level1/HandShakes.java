import java.util.Scanner;

public class HandShakes {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number of person
		System.out.println("Enter number of person : ");
		int numberOfStudents = input.nextInt();

		// Calculating the total price
		int combination = (numberOfStudents * (numberOfStudents - 1)) / 2;

		System.out.println("Total possible handshakes for " + numberOfStudents + " number of students is : " + combination);
	
		// closing the scanner resource
		input.close();
	}
}