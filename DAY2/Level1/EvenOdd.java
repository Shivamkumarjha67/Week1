import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of a natural number
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		
		if(num > 0) {			
			// using for loop
			for(int i=1; i<=num; i++) {
				if(i % 2 == 0) {
					System.out.println(i + " is even.");
				} else {
					System.out.println(i + " is odd.");
				}
			}
		} else {
			System.out.println("Entered number is not natural.");
		}
		
		// closing the scanner resource
		input.close();
	} 
}