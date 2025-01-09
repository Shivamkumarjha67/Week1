import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of number
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		// calculating the sum of digits
		int sum = 0;

		for(int i=1; i<num; i++) {
			if(num % i == 0) sum += i;
		}	

		if(sum > num)
			System.out.println("Abundant number");
		else
			System.out.println("Not a abundant number");
				
		// closing the scanner resource
		input.close();
	} 
}