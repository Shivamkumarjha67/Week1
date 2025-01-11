import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input all numbers
		System.out.println("Enter three number for the comparision: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Method call and storing the result
		int[] result = findSmallestAndLargest(number1, number2, number3);

		// Printing the reuslt
		System.out.println("Largest number is: " + result[0] + " and the smallest number is: " + result[1]);
		
		// closing the scanner resource
		input.close();
	}
	
	// Method declaration
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int[] result = new int[2];
		
		// Finding the largest and storing in result array
		if(number1 > number2 && number1 > number3) {
			result[0] = number1;
		} else if(number2 > number3 && number2 > number1) {
			result[0] = number2;
		} else result[0] = number3;
		
		// Finding the smallest and storing in result array
		if(number1 < number2 && number1 < number3) {
			result[1] = number1;
		} else if(number2 < number3 && number2 < number1) {
			result[1] = number2;
		} else result[1] = number3;
		
		return result;
	}
}