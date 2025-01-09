import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// Taking input of month and date
		System.out.println("Enter the month and date as integer : ");
		int month = input.nextInt();
		int date = input.nextInt();

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

		// closing the scanner resource
		input.close();
	} 
}