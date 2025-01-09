import java.util.Scanner;

public class EnterZeroOrNegative {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input number in while loop and adding as total
		double total = 0.0, enteredNum = 9.0;
		

		while(true) {
			System.out.println("Enter a number : ");
			enteredNum = input.nextDouble();
			if(enteredNum <= 0) break;

			total += enteredNum;
		}

		System.out.println("Total sum of entered number is : " + total);

		// closing the scanner resource
		input.close();
	} 
}