public class AveragePercent {
	public static void main(String[] args) {
		// Name of student
		String name = "Sam";
		// Math score
		int math = 94;
		// Physics score
		int physics = 95;
		// Chemistry score
		int chemistry = 96;

		// calculating the average percent
		int avgPercent = (math + physics + chemistry) / 3;

		System.out.println(name + " average percent marks in PCM is " + avgPercent);
	}
}