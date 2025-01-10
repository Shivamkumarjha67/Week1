import java.util.Scanner;

public class SixToNine {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// Array declaration
		int[] table = new int[4];
		
		// Input number
		System.out.println("Enter a number for the multiplication from 6 to 9: ");
		int number = input.nextInt();
				
		for(int i=0; i<4; i++) {
			table[i] = number * (i + 6);
		}

		// Showing of the array elements
		for(int i=0; i<4; i++) {
			System.out.println(number + " * " + (i + 6) + " = " + table[i]);
		}

		// Closing scanner object
		input.close();
	}
}