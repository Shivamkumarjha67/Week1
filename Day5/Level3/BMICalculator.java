import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// 2D array to store weight and height
        double[][] data = new double[10][2]; 

        // Get user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMIandStatus(data);

        // Display results
        displayResults(results);

        scanner.close();
    }

    // Calculate BMI and status for a given person
    public static String[] calculateBMIandStatus(double weight, double height) {
        String[] result = new String[4];
		
		// Convert cm to meters
        height = height / 100; 
        double bmi = weight / (height * height);

        result[0] = String.format("%.2f", height); 
        result[1] = String.format("%.2f", weight); 
        result[2] = String.format("%.2f", bmi);

        if (bmi < 18.5) {
            result[3] = "Underweight";
        } else if (bmi < 25) {
            result[3] = "Normal";
        } else if (bmi < 40) {
            result[3] = "Overweight";
        } else {
            result[3] = "Obese";
        }

        return result;
    }

    // Calculate BMI and status for all persons
    public static String[][] calculateBMIandStatus(double[][] data) {
        String[][] results = new String[10][4];
        for (int i = 0; i < 10; i++) {
            results[i] = calculateBMIandStatus(data[i][0], data[i][1]);
        }
        return results;
    }

    // Display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("--------------------------------------------------");
    }
}