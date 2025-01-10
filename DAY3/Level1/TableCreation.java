import java.util.Scanner;

public class TableCreation {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// Input the number
		System.out.println("Enter any number for table generation: ");
		int number = input.nextInt();
		
		// Arrays declaration
		int[] table = new int[10];
		
		// Table generation using for loop
		for(int i=0; i<10; i++) {
			table[i] = number * (i + 1);
		}

		// Printing the table
		for(int i=0; i<10; i++) {
			System.out.println(number + " * " + (i + 1) + " = " + table[i]);
		}

		// Closing scanner object
		input.close();
	}
}