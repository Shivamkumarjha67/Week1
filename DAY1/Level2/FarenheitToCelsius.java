import java.util.Scanner;

public class FarenheitToCelsius {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of temprature
		System.out.println("Enter the temprature in celsius : ");				float farenheit = input.nextFloat();

		// Converting to celsius to farenheit
		float celsius = (farenheit - 32) * 5 / 9;

		System.out.println("The " + celsius + " celsius is " + farenheit + " farenheit");

		// closing the scanner resource
		input.close();
	}
}