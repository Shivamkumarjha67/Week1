import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of temprature
		System.out.println("Enter the salary : ");
		float salary = input.nextFloat();
		System.out.println("Enter the variable bonus : ");
		float variableBonus = input.nextFloat();

		float income = salary + variableBonus; 

		System.out.println("Person salary is : " + salary + " and variable bonus is : " + variableBonus + " .Hence total income is : " + income);

		// closing the scanner resource
		input.close();
	}
}