import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		// Taking input of month and date
		int month = Integer.parseInt(args[0]);
		int date = Integer.parseInt(args[1]);

		// Method calling
		checkSpring(month, date);
	}
	
	// Method Declaration
	private static void checkSpring(int month, int date) {
		// Condition for checking the season
		if(month >= 3 && month <= 6) {
			if((month != 3 && month != 6) || (month == 3 && date >= 20) || (month == 6 && date <= 20)) {
				System.out.println("Its a Spring Season");
			} else {
				System.out.println("Not a Spring Season");
			}
		} else {
			System.out.println("Not a Spring Season");
		}
	}
}