import java.util.Scanner;

public class RocketLaunch1 {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number
		System.out.println("Enter the counter value");
		int counter = input.nextInt();

		// Running the counter from inputed value to 1 using while loop
		while(counter >= 1) {
			System.out.println("Value of counter : " + counter);
			counter--;
		}

		// closing the scanner resource
		input.close();
	} 
}