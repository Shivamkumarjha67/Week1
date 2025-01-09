import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of all three number
		System.out.println("Enter all three numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		// Condition for checking the largest of all three
		boolean largestNum1 = (num1 > num2 && num1 > num3);
		boolean largestNum2 = (num2 > num1 && num2 > num3);
		boolean largestNum3 = (num3 > num1 && num3 > num2);

		// Printing the result
		System.out.println("Is the first number is the largest? : " + largestNum1); 
		System.out.println("Is the second number is the largest? : " + largestNum2); 
		System.out.println("Is the third number is the largest? : " + largestNum3); 

		// closing the scanner resource
		input.close();
	} 
}