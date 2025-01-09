import java.util.Scanner;

public class SmallestOfThree {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of all three number
		System.out.println("Enter all three numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		// Condition for checking if first is smallest of all three or not
		boolean result = (num1 < num2 && num1 < num3);

		System.out.println("Is the first number the smallest? : " + result); 

		// closing the scanner resource
		input.close();
	} 
}