import java.util.Scanner;

class BMICalculator {
    // Method to compute BMI and status based on weight and height
    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] bmiResults = new String[weightHeight.length][4];

        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0];
            double heightInMeters = weightHeight[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = determineStatus(bmi);
            
            bmiResults[i][0] = String.valueOf(weightHeight[i][1]); // Height
            bmiResults[i][1] = String.valueOf(weight); // Weight
            bmiResults[i][2] = String.format("%.2f", bmi); // BMI
            bmiResults[i][3] = status; // Status
        }
        return bmiResults;
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s %-20s%n", result[0], result[1], result[2], result[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // Array to store weight and height

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and statuses
        String[][] bmiResults = calculateBMI(weightHeight);

        // Display the results
        displayResults(bmiResults);
    }
}
