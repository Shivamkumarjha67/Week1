import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input a number
		System.out.println("Enter a number for getting the sum of n natural number: ");
		int number = input.nextInt();
		
		System.out.println("Sum of " + number + " natural number is: " + getTotal(number));
		
		// closing the scanner resource
		input.close();
	}
	
	private static long getTotal(int number) {
		long total = 0;
		
		// finding the sum of all smaller natural number
		for(int i=1; i<=number; i++) { 
			total += i;
		}
		
		return total;
	}
}