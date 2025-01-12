import java.util.Scanner;

public class RootsFinding {
    public static void main(String[] args) {
		// Initializing the scanner object
        Scanner input = new Scanner(System.in);

        // Input the coefficient a, b, and c
		System.out.println("Enter the coefficient a, b, and c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		// getting root of passed coefficient
		int[] roots = getRoots(a, b, c);
		
		// Printing the result
		if(roots == null) System.out.println("No roots.");
		else {
			for(int root : roots) {
				System.out.println("Roots are: " + root);
			}
		}

		// Closing the scanner resource
        input.close();
    }
	
	// Method declaration
	public static int[] getRoots(int a, int b, int c) {
		// Determine the delta
		int delta = (int)Math.pow(b, 2) + (4 * a * c);
		
		// finding roots of given eqn
		if(delta > 0) {
			int root1 = (-b + (int)Math.sqrt(delta)) / (2 * a);
			int root2 = (-b - (int)Math.sqrt(delta)) / (2 * a);
			
			return new int[]{root1, root2};
		} else if(delta == 0) {
			int root = -b / (2 * a);
			return new int[]{root};
		} else return null;
	}
}