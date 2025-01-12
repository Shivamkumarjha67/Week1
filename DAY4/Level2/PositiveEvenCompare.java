import java.util.Scanner;

public class PositiveEvenCompare {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
				
		// Taking input of height
		System.out.println("Enter five numbers: ");
		int[] numbers = new int[5];
		
		for(int i=0; i<5; i++) {
			numbers[i] = input.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			if(isPositive(numbers[i])) {
				System.out.println(numbers[i] + " is positive and " + ((isEven(numbers[i])) ? "even" : "odd"));
			} else System.out.println("Not a positive number.");
		}
		
		System.out.println(numbers[0] + " is "+ compare(numbers[0], numbers[4]) + " " + numbers[4]);
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration positive
	public static boolean isPositive(int number) {
		return (number > 0);
	}
	
	// Method Declaration for even
	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}
	
	// Method Declaration for comparision
	public static String compare(int num1, int num2) {
		if(num1 > num2) return "greater than ";
		else if(num1 == num2) return "equal to ";
		else return "smaller than ";
	}
}