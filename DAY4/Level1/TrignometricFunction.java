import java.util.Scanner;

public class TrignometricFunction {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Input the angle
		System.out.println("Enter the angle: ");
		double angle = input.nextDouble();
		
		// Method call and storing the result
		double[] functionResult = new TrignometricFunction().calculateTrigonometricFunctions(angle);

		// Printing the reuslt
		System.out.println("Trignometric sine will be: " + functionResult[0] + "\nTrignometric cosine will be: " + functionResult[1] + "\nTrignometric tangent will be: " + functionResult[2]);
		
		// closing the scanner resource
		input.close();
	}
	
	// Method declaration
	public double[] calculateTrigonometricFunctions(double angle) {
		double angleInRadian = Math.toRadians(angle);
		double[] functionResult = new double[3];
		
		System.out.println(angleInRadian);
		
		functionResult[0] = Math.sin(angleInRadian);
		functionResult[1] = Math.cos(angleInRadian);
		functionResult[2] = Math.tan(angleInRadian);
		
		return functionResult;
	}
}