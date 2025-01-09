public class PenDistribution {
	public static void main(String[] args) {
		// given number of pens
		int pensAvailable = 14;
		// number of student present
		int numberOfStudents = 3;

		// calculating the number of pens per student
		int pensPerStudent = pensAvailable / numberOfStudents;
		// // calculating the number of pens left
		int nonDistributedPens = pensAvailable % numberOfStudents;

		System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + nonDistributedPens);
	}
}