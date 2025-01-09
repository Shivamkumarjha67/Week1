import java.util.Scanner;

public class RocketLaunch2 {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number
		System.out.println("Enter the counter value");
		int counter = input.nextInt();

		// Running the counter from inputted value to 1 using for loop
		for(;counter >= 1; counter--) { 
			System.out.println("Value of counter is : " + counter);
		}

		// closing the scanner resource
		input.close();
	} 
}