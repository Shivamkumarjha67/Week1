import java.util.Scanner;
import java.util.Arrays;

public class FactorOfNumber {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int maxIndex = 10, index = 0;
		int[] factor = new int[maxIndex];

		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				if(maxIndex == index) {
					maxIndex *= 2;
					factor = Arrays.copyOf(factor, maxIndex);
				}

				factor[index++] = i;
			}
		}

		for(int i=0; i<maxIndex; i++) {
			System.out.println((i+1) + " Factors is: " + factor[i]);
		}
		
		// Closing scanner object
		input.close();
	}
}