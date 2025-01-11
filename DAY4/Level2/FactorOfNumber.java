import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of number
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// Method calling for getting all factors of the number passed
		int[] factors = findingFactor(number);
		
		// Finding the sum of factors and it's multiplication
		long sumOfFactors = 0;
		long multiplicationOfFactor = 1;
		
		for(int i=0; i<factors.length; i++) {
			sumOfFactors += factors[i];
			multiplicationOfFactor *= factors[i];
		}
		
		// Sum of square of factors
		long sumOfSquare = 0;
		
		for(int i=0; i<factors.length; i++) {
			sumOfSquare += (int)Math.pow(factors[i], 2);
		}
		
		System.out.println("sum Of factors: " + sumOfFactors + "\nSum of square of factor: " + sumOfSquare + "\nMultiplication of factors: " + multiplicationOfFactor);

		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration
	private static int[] findingFactor(int number) {
		int counter = 0;
		
		// Number of factors
		for(int i=1; i<=number; i++) {
			if(number % i == 0) counter++;
		}
		
		int[] factors = new int[counter];
		counter = 0;
		
		// Finding the factors
		for(int i=1; i<=number; i++) {
			if(number % i == 0) factors[counter++] = i;
		}
		
		return factors;
	}
}