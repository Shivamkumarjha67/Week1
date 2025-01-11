import java.util.Scanner;

public class UnitConvertor3 {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of year
		System.out.println("Enter value for conversion then select the conversion you want: \n1. farenheit to celsius. \n2. calsius to farenheit. \n3. pound to kg. \n4. kg to pound. \n5. gallon to liters. \n6. liters to gallons.");
		double number = input.nextDouble();
		int operation = input.nextInt();
		
		// Calling the operation based user choice using switch and printing the result
		switch(operation) {
			case 1: System.out.println(number + " farenheit equals to: " + convertFarenheitToCelsius(number) + " celsius.");
					break;
			case 2: System.out.println(number + " celsius equals to: " + convertCelsiusToFarenheit(number) + " farenheit.");
					break;
			case 3: System.out.println(number + " pound equals to: " + convertPoundToKg(number) + " kg.");
					break;
			case 4: System.out.println(number + " kg equals to: " + convertKgToPound(number) + " pound.");
					break;
			case 5: System.out.println(number + " gallons equals to: " + convertGallonToLiter(number) + " liter.");
					break;
			case 6: System.out.println(number + " liters equals to: " + convertLiterToGallon(number) + " gallon.");
					break;
			default: System.out.println("Wrong operation type opted.");
		}
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration for farenheit to celsius
	private static double convertFarenheitToCelsius(double farenheit) {
		double celsius = (farenheit - 32) * 5 / 9;
		return celsius;
	}
	
	// Method Declaration for celsius to farenheit
	private static double convertCelsiusToFarenheit(double celsius) {
		double farenheit = (celsius * 9 / 5) + 32;
		return farenheit;
	}
	
	// Method Declaration for pound to kg
	private static double convertPoundToKg(double pound) {
		double poundToKg = 0.453592;;
		double kg = pound * poundToKg;
		
		return kg;
	}
	
	// Method Declaration for kg to pound
	private static double convertKgToPound(double kg) {
		double kgToPound = 2.20462;
		double pound = kg * kgToPound;
		
		return pound;
	}
	
	// Method Declaration for gallon to liter
	private static double convertGallonToLiter(double gallon) {
		double gallonToLiter = 3.78541;
		double liter = gallon * gallonToLiter;
		
		return liter;
	}
	
	// Method Declaration for liter to gallon
	private static double convertLiterToGallon(double liter) {
		double literToGallon = 0.264172;
		double gallon = liter * literToGallon;
		
		return gallon;
	}
}