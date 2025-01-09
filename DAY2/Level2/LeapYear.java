import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Multiple if-else statements
        if (year < 1582) {
            System.out.println("The year must be >= 1582 (Gregorian calendar starts).");
        } else if (year % 4 != 0) {
            System.out.println(year + " is not a Leap Year.");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}
