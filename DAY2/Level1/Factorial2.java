import java.util.Scanner;

public class Factorial2 {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of a natural number
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		
		if(num > 0) {
			// Finding the factorial
			int factorial = 1;
			
			// using for loop
			for(;num > 1; num--) {
				factorial *= num;
			}

			System.out.println("Factorial of entered input is : " + factorial);
		} else {
			System.out.println("Enter number is negative.");
		}
		
		// closing the scanner resource
		input.close();
	} 
}