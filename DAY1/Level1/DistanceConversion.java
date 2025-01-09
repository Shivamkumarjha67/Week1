import java.util.Scanner;

public class DistanceConversion {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of distance in feet
		System.out.println("Enter distance in Feet : ");
		float distanceInFeet = input.nextFloat();

		// Converting into yard
		float distanceInYard = distanceInFeet / 3f;

		// Converting into mile
		float distanceInMile = distanceInYard / 1760f;

		System.out.println("Your distance in feet is : " + distanceInFeet + " while in yard is : " + distanceInYard + " and in mile is : " + distanceInMile);
	
		// closing the scanner resource
		input.close();
	}
}