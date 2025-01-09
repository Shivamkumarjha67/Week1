import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor
                System.out.println("Factor are : " + i);
            }
        }

        input.close();
    }
}
