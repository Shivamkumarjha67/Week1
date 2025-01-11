import java.util.Scanner;

public class UnitConvertor {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of year
		System.out.println("Enter value for conversion then select the conversion you want: \n1. km to miles. \n2. miles to km. \n3. meter to feet. \n4. feet to meter.");
		double number = input.nextDouble();
		int operation = input.nextInt();
		
		// Calling the operation based user choice using switch and printing the result
		switch(operation) {
			case 1: System.out.println(number + " km equals to: " + convertKmToMiles(number) + " miles.");
					break;
			case 2: System.out.println(number + " miles equals to: " + convertMilesToKm(number) + " km.");
					break;
			case 3: System.out.println(number + " meters equals to: " + convertMeterToFeet(number) + " feet.");
					break;
			case 4: System.out.println(number + " km equals to: " + convertFeetToMeter(number) + " meters.");
					break;
			default: System.out.println("Wrong operation type opted.");
		}
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration for km to miles
	private static double convertKmToMiles(double km) {
		double kmToMiles = 0.621371;
		double miles = km * kmToMiles;
		
		return miles;
	}
	
	// Method Declaration for miles to km
	private static double convertMilesToKm(double miles) {
		double milesToKm = 1.60934;
		double km = miles * milesToKm;
		
		return km;
	}
	
	// Method Declaration for meter to feet
	private static double convertMeterToFeet(double meter) {
		double meterToFeet = 3.28084;
		double feet = meter * meterToFeet;
		
		return feet;
	}
	
	// Method Declaration for feet to meter
	private static double convertFeetToMeter(double feet) {
		double feetToMeter = 0.3048;
		double meter = feet * feetToMeter;
		
		return meter;
	}
}