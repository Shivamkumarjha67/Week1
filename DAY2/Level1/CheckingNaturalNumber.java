import java.util.Scanner;

public class CheckingNaturalNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		// Condition for checking the natural number
		if(num > 0) {
			int sumOfNaturalNum = num * (num + 1) / 2;
			System.out.println("The sum of " + num + " natural number is : " + sumOfNaturalNum);
		} else {
			System.out.println("The number " + num + " is not a natural number");
		}

		// closing the scanner resource
		input.close();
	} 
}