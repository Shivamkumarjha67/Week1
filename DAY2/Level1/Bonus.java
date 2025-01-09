import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of salary and year of service
		System.out.println("Enter the salary and year of service : ");
		double salary = input.nextDouble();
		float yearOfService = input.nextFloat();
		
		// Calculating the bonus
		if(yearOfService > 5) {
			double bonus = salary * 5 / 100;

			System.out.println("Bonus amounts to : " + bonus);
		} else {
			System.out.println("No Bonus!");
		}
				
		// closing the scanner resource
		input.close();
	} 
}