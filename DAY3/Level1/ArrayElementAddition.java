import java.util.Scanner;

public class ArrayElementAddition {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// Array declaration
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0;

		// Input the array elements
		System.out.println("Enter any elements for the array: ");
				
		while(true) {
			double element = input.nextDouble();
			
			if(index == 10 || element <= 0) break;
			arr[index] = element;
			index++;
		}

		// Summation of the array elements
		for(index=0; index<10; index++) {
			total += arr[index];
		}

		System.out.println("Sum of the array's element is: " + total);

		// Closing scanner object
		input.close();
	}
}