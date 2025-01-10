import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);
		
		// Arrays declaration
		int[] arr = new int[5];

		System.out.println("Enter all 5 numbers of the array : ");
		
		// Age initialization
		for(int i=0; i<5; i++) {
			arr[i] = input.nextInt();
		}

		// Checking positive, negative or zero
		for(int i=0; i<5; i++) {
			if(arr[i] > 0) {
				if(arr[i] % 2 == 0) {
					System.out.println(arr[i] + " is positive and a even number.");
				} else {
					System.out.println(arr[i] + " is positive and a odd number.");
				}
			} else if(arr[i] < 0) {
				System.out.println(arr[i] + " is a negative number.");
			} else {
				System.out.println("Number is zero.");
			}
		}
		
		// comparing the first and last number of array
		if(arr[0] > arr[4]) System.out.println(arr[0] + " is first number and greater than the last nummber " + arr[4]);
		else if(arr[0] <arr[4]) System.out.println(arr[0] + " is first number and lesser than the last nummber " + arr[4]);
		else System.out.println(arr[0] + " is first number and equal to the last nummber " + arr[4]);

		// Closing scanner object
		input.close();
	}
}