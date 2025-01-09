import java.util.Scanner;

public class FindingGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks of physics, math and chemistry : ");
        int physics = input.nextInt();
	int math = input.nextInt();
	int chemistry = input.nextInt();

        // calculating the percentage of the marks
	float avgMarks = (physics + math + chemistry) / 3f;
	
	if(avgMarks >= 80) {
		System.out.println("Average Marks is : " + avgMarks + " ,grade is : A and Remarks is : Level 4, above agency-normalized standards.");
	} else if(avgMarks >= 70) {
		System.out.println("Average Marks is : " + avgMarks + " ,grade is : B and Remarks is : Level 3, at agency-normalized standards.");
	} else if(avgMarks >= 60) {
		System.out.println("Average Marks is : " + avgMarks + " ,grade is : C and Remarks is : Level 2, below, but approaching agency-normalized standards.");
	} else if(avgMarks >= 50) {
		System.out.println("Average Marks is : " + avgMarks + " ,grade is : D and Remarks is : Level 1, well below agency-normalized standards.");
	} else if(avgMarks >= 40) {
		System.out.println("Average Marks is : " + avgMarks + " ,grade is : E and Remarks is : Level 1-, too below agency-normalized standards.");
	} else {
		System.out.println("Average Marks is : " + avgMarks + " ,grade is : R and Remarks is : Remedial standards.");
	}

        input.close();
    }
}
