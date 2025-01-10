import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		if(number <= 0) {
			System.out.println("Error! not a natural number");
			System.exit(-1);
		}

		// Array declaration
		int[] even = new int[number / 2 + 1];
		int[] odd = new int[number / 2 + 1];

		int oddIndex = 0, evenIndex = 0;
		
		// Iterating from 1 to entered number and assiging to the respective array		
		for(int i=1; i<=number; i++) {
			if(i % 2 == 0) {
				even[evenIndex++] = i;
			} else {
				odd[oddIndex++] = i;
			}
		}

		// Printing the array
		for(int i=0; i<number / 2 + 1; i++) {
			System.out.println("Even array element at " + i + " index is: " + even[i]);
		}

		for(int i=0; i<number / 2 + 1; i++) {
			System.out.println("Odd array element at " + i + " index is: " + odd[i]);
		}

		// Closing scanner object
		input.close();
	}
}