public class findAge {
	public static void main(String[] args) {
		// declaring and initializing the name
		String name = "Harry";

		// declaring and initializing the birth year
		int birthYear = 2000;
		//declaring the current year
		int currentYear = 2024;

		// calculating the current age
		int currentAge = currentYear - birthYear;

		System.out.println(name + " age is " + currentAge);
	}
}