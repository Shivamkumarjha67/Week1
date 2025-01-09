import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		int originalNumber = num;

		// calculating the sum of digits
		int sum = 0;

		while(num > 0) {
			sum += (num % 10);
			num /= 10;
		}	

		boolean result = (originalNumber % sum) == 0;

		System.out.println(originalNumber + " is a Harshad number? : " + result);
				
		// closing the scanner resource
		input.close();
	} 
}