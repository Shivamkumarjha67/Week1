import java.util.Scanner;

public class DigitCounter {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		// Counting the digits in number
		int total = 0;
		System.out.print("Number of digit in " + num + " : ");
	
		while(num > 0) {
			total++;
			num /= 10;
		}	

		System.out.println(total);
				
		// closing the scanner resource
		input.close();
	} 
}