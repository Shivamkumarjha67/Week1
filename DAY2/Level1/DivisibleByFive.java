import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		// conversion into pound
		boolean result = (num % 5) == 0;

		System.out.println("Is the number " + num + " divisible by 5? : " + result); 

		// closing the scanner resource
		input.close();
	} 
}