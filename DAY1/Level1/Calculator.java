import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// Initializing the Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Taking the input of both numbers as floating number
		System.out.println("Enter the first number : ");
		float num1 = sc.nextFloat();
		System.out.println("Enter the second number : ");
		float num2 = sc.nextFloat();

		// Performing each operation one by one now
		
		float addition = num1 + num2;
		float substraction = num1 - num2;
		float multiplication = num1 * num2;
		float division = (num2 == 0f) ? Float.MIN_VALUE : num1 / num2;

		System.out.println("The addition, substraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is : " + addition + " , " + substraction + " , " + multiplication + " , " + division);
	
		sc.close();
	}
}