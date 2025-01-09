import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        // Input the power
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize the result variable
        int result = 1;

        // calculating the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with the base number
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);

        input.close();
    }
}
