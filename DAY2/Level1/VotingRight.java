import java.util.Scanner;

public class VotingRight {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of number
		System.out.println("Enter the number : ");
		int age = input.nextInt();

		// Condition for checking voting right
		if(age >= 18) {
			System.out.println("The person's age is " + age + " and can vote.");
		} else {
			System.out.println("The person's age is " + age + " and cannot vote.");
		}

		// closing the scanner resource
		input.close();
	} 
}