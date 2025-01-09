import java.util.Scanner;

public class SimpleIntrest {
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

		float intrest = principle * time * rate / 100;

		System.out.println("The Simple Intrest is " + intrest + " for principle " + principle + " , rate of intrest " + rate + " and time " + time); 

		// closing the scanner resource
		input.close();
	} 
}