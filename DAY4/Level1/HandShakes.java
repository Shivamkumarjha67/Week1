import java.util.Scanner;

public class HandShakes {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input number of students
		System.out.println("Enter the number of students: ");
		int students = input.nextInt();
		
		System.out.println("Total number of hand shakes is: " + getCombination(students) + ", among " + students + " number of students.");
	
		// closing the scanner resource
		input.close();
	}
	
	// Method declaration
	private static long getCombination(int students) {
		// finding all possible hand shakes
		long shakes = students * (students - 1) / 2;
		return shakes;
	}
}