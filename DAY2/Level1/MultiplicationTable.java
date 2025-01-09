import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		// Generating table using for loop
		for(int i=6; i<=9; i++) {
			int result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
				
		// closing the scanner resource
		input.close();
	} 
}