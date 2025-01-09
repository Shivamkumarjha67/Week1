public class VolumeOfEarth {
	public static void main(String[] args) {
		// Initializing the given radius of the earth
		double radiusInKm = 6378;
		double radiusInMiles = 6378 * 1.6;

		// value of pi or (22/7)
		double pi = (double)22 / 7;

		// Volume in cubic kilometers
		double volumeInCubicKms = 4 / 3 * pi * radiusInKm * radiusInKm * radiusInKm;

		// Volume in cubic miles
		double volumeInCubicMiles = 4 / 3 * pi * radiusInMiles * radiusInMiles * radiusInMiles;

		System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKms + " and in cubic miles is " + volumeInCubicMiles);
	}
}