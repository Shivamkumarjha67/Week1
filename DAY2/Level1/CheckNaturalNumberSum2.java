import java.util.Scanner;

public class CheckNaturalNumberSum2 {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);

		// taking input of a natural number
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		int sumOfNaturalNum = num * (num + 1) / 2;
		int sum = 0;

		// Using for loop
		for(; num >= 1; num--) {
			sum += num;
		}

		System.out.println("check is correct? : " + (sum == sumOfNaturalNum) + " , and sum is : " + sum);

		// closing the scanner resource
		input.close();
	} 
}