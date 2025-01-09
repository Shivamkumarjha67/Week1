import java.util.Scanner;

public class EnterZero {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input number in while loop and adding as total
		double total = 0.0, enteredNum = 9.0;
		

		while(enteredNum != 0) {
			System.out.println("Enter a number : ");
			enteredNum = input.nextDouble();
			total += enteredNum;
		}

		System.out.println("Total sum of entered number is : " + total);

		// closing the scanner resource
		input.close();
	} 
}