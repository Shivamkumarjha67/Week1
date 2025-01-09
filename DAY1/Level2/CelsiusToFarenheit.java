import java.util.Scanner;

public class CelsiusToFarenheit {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of temprature
		System.out.println("Enter the temprature in celsius : ");				float celsius = input.nextFloat();

		// Converting to farenheit from celsius
		float farenheit = (celsius * 9 / 5) + 32;

		System.out.println("The " + celsius + " celsius is " + farenheit + " farenheit");

		// closing the scanner resource
		input.close();
	}
}