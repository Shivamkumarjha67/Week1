import java.util.Scanner;

public class UniversityCourseByInput {
    public static void main(String[] args) {
	// Initializing the scanner object
	Scanner sc = new Scanner(System.in);

        // Input Fees charge for the course
	System.out.println("Enter the fees : ");
        int fees = sc.nextInt();

        // Discount offered in percentage
	System.out.println("Enter the discount percent : ");
        float discountPercent = sc.nextFloat();

        float discountedFees = fees * discountPercent / 100;
        float discountedAmount = fees - discountedFees;

        System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedFees);

	sc.close();
    }
}