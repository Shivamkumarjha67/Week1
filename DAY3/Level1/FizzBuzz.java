import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	
		// 2D array declaration
		String[] store = new String[number + 1];

		for(int i=0; i<=number; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				store[i] = "FizzBuzz";	
			} else if(i % 3 == 0) {
				store[i] = "Fizz";
			} else if(i % 5 == 0) {
				store[i] = "Buzz";
			} else store[i] = String.valueOf(i);
		}

		// Printing the result
		for(int i=0; i<=number; i++) {
			System.out.println("At index: " + i + " result is: "+ store[i]);
		}
		
		// Closing scanner object
		input.close();
	}
}