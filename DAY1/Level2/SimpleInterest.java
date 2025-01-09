import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of principle, rate and time
		System.out.println("Enter the principle amount : ");
		float principle = input.nextFloat();

		System.out.println("Enter the rate : ");
		float rate = input.nextFloat();

		System.out.println("Enter the time : ");
		float time = input.nextFloat();

		float interest = principle * time * rate / 100;

		System.out.println("The Simple Interest is " + interest + " for principle " + principle + " , rate of interest " + rate + " and time " + time); 

		// closing the scanner resource
		input.close();
	} 
}