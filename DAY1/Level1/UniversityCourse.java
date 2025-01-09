public class UniversityCourse {
	public static void main(String[] args) {
		// Fees charge for the course
		int fees = 125000;

		// Discount offered in percentage
		float discountPercent = 10f;

		float discountedAmount = fees * discountPercent / 100;
		float discountedFees = fees - discountedAmount;

		System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedFees);
	}
}