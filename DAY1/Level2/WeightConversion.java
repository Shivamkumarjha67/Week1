import java.util.Scanner;

public class WeightConversion {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of weight in kg
		System.out.println("Enter your weight in kg : ");
		int weightInKg = input.nextInt();

		// conversion into pound
		double weightInPound = weightInKg / 2.2;

		System.out.println("The weight of the person in pound is " + weightInPound + " and in kg is " + weightInKg); 

		// closing the scanner resource
		input.close();
	} 
}