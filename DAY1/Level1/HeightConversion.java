import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
	// Initializing the scanner object
	Scanner sc = new Scanner(System.in);

        // Taking input of height in cm
	System.out.println("Enter the height in cm : ");
        int heightInCm = sc.nextInt();

        // calculation of height in inch
        float heightInInch = heightInCm / 2.54f;

	// Calculation height in foot
	float heightInFoot = heightInInch / 12;

        System.out.println("Your height in cm is : " + heightInCm + " while in foot is " + heightInFoot + " and inches is " + heightInInch);

	sc.close();
    }
}

