import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array declaration for weight and height of each person
        double[][] personRecord = new double[10][3];
		String[] status = new String[10];

        // Input weight(in kg) and height(in cm)
        System.out.println("Enter weight (in kg) and height (in cm) of each person: ");
		for(int i=0; i<10; i++) {		
			for(int j=0; j<2; j++) {
				if(j == 0)
				personRecord[i][j] = input.nextDouble();
				else
				personRecord[i][j] = input.nextDouble()/100;
			}
		}

        // Calculating BMI of each person
        for(int i=0; i<10; i++) {
			personRecord[i][2] = personRecord[i][0] / (personRecord[i][1] * personRecord[i][1]);
		}    
		
		getStatus(personRecord, status);

        // Display the weight status
        for(int i=0; i<10; i++) {
			System.out.println("Person having weight of " + personRecord[i][0] + " and height of " + personRecord[i][1] + " m have bmi equals: " + personRecord[i][2] + " and his weight Status is: " + status[i]);
		}

        input.close();
    }
	
	public static void getStatus(double[][] personRecord, String[] status) {
		// Determine the weight status based on BMI
		for(int i=0; i<10; i++) {
			String weightStatus;
			if (personRecord[i][2] < 18.5) {
					weightStatus = "Underweight";
			} else if (personRecord[i][2] >= 18.5 && personRecord[i][2] <= 24.9) {
					weightStatus = "Normal";
			} else if (personRecord[i][2] >= 25.0 && personRecord[i][2] <= 39.9) {
					weightStatus = "Overweight";
			} else {
				weightStatus = "Obese";
			}

			status[i] = weightStatus;
		}    
	}
}