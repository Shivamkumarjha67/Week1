import java.util.Scanner;

public class Copying2DTo1D {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter number of rows and column: ");
		int row = input.nextInt();
		int column = input.nextInt();
	
		// 2D array declaration
		int[][] twoDMatrix = new int[row][column];
		System.out.println("Enter all elemens of array: ");

		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {	
				twoDMatrix[i][j] = input.nextInt();		
			}
		}

		// 1D arraty declaration
		int array[] = new int[row * column];
		int index = 0;
		
		// Assigning the 2D elements to the 1D array
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {	
				array[index++] = twoDMatrix[i][j];		
			}
		}

		// Printing the 1D array
		for(int i=0; i<row*column; i++) {
			System.out.println("Printing the elements of 1D array at " + " index " + i + " : " + array[i]);
		}
		
		// Closing scanner object
		input.close();
	}
}