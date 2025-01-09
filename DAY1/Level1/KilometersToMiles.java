public class KilometersToMiles {
	public static void main(String[] args) {
		// given distance in km
		float kilometers = 10.8f;
		// one mile equal to 1.6 km
		float milesToKm = 1.6f;

		// converting the distance in miles
		float inMiles = kilometers / kmToMiles;

		System.out.println(kilometers + " kilometers in miles equals : " + inMiles);
	}
}