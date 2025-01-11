import java.util.Scanner;

public class StudentVoteChecker {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input of age
		System.out.println("Enter the age all 10 students: ");
		int[] studentAge = new int[10];
		
		for(int i=0; i<10; i++) {
			studentAge[i] = input.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Student having the age of " + studentAge[i] + " can vote?. : " + new StudentVoteChecker().canStudentVote(studentAge[i]));
		}
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration for farenheit to celsius
	public boolean canStudentVote(int age) {
		if(age < 0) return false;
		else if(age >= 18) return true;
		else return false;
	}
}