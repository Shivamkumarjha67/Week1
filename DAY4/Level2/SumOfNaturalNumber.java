import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of number
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// Using formulae
		int sumOfNaturalNumber = number * (number + 1) / 2;
		
		// Printing the result of the summation
		System.out.println("Is both method getting the same summation?: " + (sumOfNaturalNumber == getSumOfNaturalNumber(number)));
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration
	private static int getSumOfNaturalNumber(int number) {
		if(number == 0) return 0;
		// Recursive calls
		return number + getSumOfNaturalNumber(number - 1);
	}
}