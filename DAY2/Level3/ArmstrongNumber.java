import java.util.Scanner;
import static java.lang.Math.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		int originalNumber = num;
		int size = String.valueOf(num).length();
		int sum = 0;

		// Getting the sum of power of each digits
		while(num > 0) {
			int digit = num % 10;
			sum += pow(digit, size);
			num /= 10;
		}

		System.out.println(originalNumber + " is armstrong number? : " + (originalNumber == sum));
				
		// closing the scanner resource
		input.close();
	} 
}