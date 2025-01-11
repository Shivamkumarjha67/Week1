import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input number
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		int nature = getNature(num);
		
		if(nature == 1) System.out.println("Number is positive.");
		else if(nature == -1) System.out.println("Number is nagetive.");
		else System.out.println("Zero");
	}
	
	// Method Declaration
	private static int getNature(int number) {
		// Making decision of positive and nagetive
		if(number > 0) return 1;
		else if(number < 0) return -1;
		else return 0;
	}
}