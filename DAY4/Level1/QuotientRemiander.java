import java.util.Scanner;

public class QuotientRemiander {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input a number and divisor
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		System.out.println("Enter divisor: ");
		int divisor = input.nextInt();
		
		// Method call and storing the result
		int[] result =findRemainderAndQuotient(number, divisor);

		// Printing the reuslt
		System.out.println("When number " + number + " is divided by " + divisor + " then it gives quotient as " + result[0] + "and remiander as " + result[1]);
		
		// closing the scanner resource
		input.close();
	}
	
	// Method declaration
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int[] result = new int[2];
		
		result[0] = number / divisor;
		result[1] = number % divisor;
		
		return result;
	}
}