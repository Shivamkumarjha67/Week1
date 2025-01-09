import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Number is smaller than 0.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Looping backward
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { 
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
