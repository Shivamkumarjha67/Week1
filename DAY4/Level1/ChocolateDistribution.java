import java.util.Scanner;

public class ChocolateDistribution {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input a number of children and chocolate
		System.out.println("Enter the number of children: ");
		int numberOfChildren = input.nextInt();
		
		System.out.println("Enter the number chocolate: ");
		int numberOfChocolate = input.nextInt();
		
		// Method call and storing the result
		int[] result =findRemainderAndQuotient(numberOfChocolate, numberOfChildren);

		// Printing the reuslt
		System.out.println("Each children will get " + result[0] + " and " + result[1] + " chocolate will left.");
		
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