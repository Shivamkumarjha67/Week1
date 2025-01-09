import java.util.Scanner;

public class KilometersToMilesTakingInput {
	public static void main(String[] args) {
		// Initializing the Scanner object
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the distance : ");

		// Taking input in kilometers
		double distanceInKm = sc.nextDouble();

		// converting the distance in miles
		double distanceInMiles = distanceInKm / 1.6;

		System.out.println("The total miles is " + distanceInMiles + " for the given " + distanceInKm + " kms");
	}
}