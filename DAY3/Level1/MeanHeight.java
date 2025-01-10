import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// Array declaration
		double[] heights = new double[11];
		
		// Input different heights
		System.out.println("Enter the heights of all players: ");
		
		for(int i=0; i<11; i++) {
			heights[i] = input.nextDouble();
		}

		// finding the mean height
		double meanHeight = 0.0;

		for(int i=0; i<11; i++) {
			meanHeight += heights[i];
		}

		meanHeight /= 11;

		System.out.println("Mean height of the football team is " + meanHeight);

		// Closing scanner object
		input.close();
	}
}