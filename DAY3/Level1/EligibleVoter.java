import java.util.Scanner;

public class EligibleVoter {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);
		
		// Arrays declaration
		int[] age = new int[10];

		System.out.println("Enter the age all 10 students: ");
		
		// Age initialization
		for(int i=0; i<10; i++) {
			age[i] = input.nextInt();
		}

		// Checking the voting eligiblity
		for(int i=0; i<10; i++) {
			if(age[i] >= 18) {
				System.out.println("The student with the age " + age[i] + " can vote");
			} else {
				System.out.println("The student with the age " + age[i] + " cannot vote");
			}
		}

		// Closing scanner object
		input.close();
	}
}