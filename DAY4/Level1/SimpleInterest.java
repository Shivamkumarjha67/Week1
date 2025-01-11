import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input Principle amount
		System.out.println("Enter the principle amount: ");
		double principle = input.nextDouble();
		
		// Input rate of interest
		System.out.println("Enter the rate of interest: ");
		double rate = input.nextDouble();
		
		// Input the time
		System.out.println("Enter the time: ");
		float time = input.nextFloat();
		
		new SimpleInterest().getSimpleInterest(principle, rate, time);
	
		// closing the scanner resource
		input.close();
	}
	
	//Method Declaration
	private void getSimpleInterest(double principle, double rate, float time) {
		// Finding the interest
		double interest = (principle * rate * time) / 100.0;
		
		System.out.println("The simple interest is: " + interest + " for the principle " + principle + ", rate " + rate + " and time " + time);
	}
}