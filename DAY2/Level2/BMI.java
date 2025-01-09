import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight in kg
        System.out.print("Enter your weight (in kg): ");
        double weight = input.nextDouble();

        // Input height in cm
        System.out.print("Enter your height (in cm): ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine the weight status based on BMI
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Display the weight status
        System.out.println("Weight Status: " + weightStatus);

        input.close();
    }
}
