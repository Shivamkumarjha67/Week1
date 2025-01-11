import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of year
		System.out.println("Enter the year for checking the leap year: ");
		int year = input.nextInt();
		
		// Checking and printing the output
		if(year < 1528) System.out.println("Not a/c to Gregorian calendar.");
		else {
			System.out.println(year + " is a leap year? :" + isLeapYear(year));
		}
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration
	private static boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0) return true;
		else if(year % 400 == 0) return true;
		
		return false;
	}
}