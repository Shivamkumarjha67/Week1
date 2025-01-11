import java.util.Scanner;

public class UnitConvertor2 {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of year
		System.out.println("Enter value for conversion then select the conversion you want: \n1. km to miles. \n2. miles to km. \n3. meter to feet. \n4. feet to meter. \n5. inches to cm");
		double number = input.nextDouble();
		int operation = input.nextInt();
		
		// Calling the operation based user choice using switch and printing the result
		switch(operation) {
			case 1: System.out.println(number + " yard equals to: " + convertYardToFeet(number) + " feet.");
					break;
			case 2: System.out.println(number + " feet equals to: " + convertFeetToYard(number) + " yard.");
					break;
			case 3: System.out.println(number + " meters equals to: " + convertMeterToInches(number) + " inches.");
					break;
			case 4: System.out.println(number + " inches equals to: " + convertInchesToMeter(number) + " meters.");
					break;
			case 5: System.out.println(number + " inches equals to: " + convertInchesToCm(number) + " cm.");
					break;
			default: System.out.println("Wrong operation type opted.");
		}
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration for yard to feet
	private static double convertYardToFeet(double yard) {
		double yardToFeet = 3;
		double feet = yard * yardToFeet;
		
		return feet;
	}
	
	// Method Declaration for feet to yard
	private static double convertFeetToYard(double feet) {
		double feetToYard = 0.333333;
		double yard = feet * feetToYard;
		
		return yard;
	}
	
	// Method Declaration for meter to inches
	private static double convertMeterToInches(double meter) {
		double meterToInches = 39.3701;
		double inches = meter * meterToInches;
		
		return inches;
	}
	
	// Method Declaration for inches to meter
	private static double convertInchesToMeter(double inches) {
		double inchesToMeter = 0.0254;
		double meter = inches * inchesToMeter;
		
		return meter;
	}
	
	// Method Declaration for inches to cm
	private static double convertInchesToCm(double inches) {
		double inchesToCm = 2.54;
		double cm = inches * inchesToCm;
		
		return cm;
	}
}