import java.util.Scanner;

public class TemperatureWindSpeed {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input the temperature and wind speed 
		System.out.println("Enter the temperature: ");
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind speed: ");
		double windSpeed = input.nextDouble();
		
		// Method call and storing the result
		double windChill = new TemperatureWindSpeed().calculateWindChill(temperature, windSpeed);

		// Printing the reuslt
		System.out.println("With the given temperature and wind speed, the wind chill will be: " + windChill);
		
		// closing the scanner resource
		input.close();
	}
	
	// Method declaration
	public double calculateWindChill(double temperature, double windSpeed) {
		// Calculating the wind chill
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}
}