import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		// Initializing the Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Taking the input of height and base
		System.out.println("Enter the height of triangle in cm : ");
		int height = sc.nextInt();
		System.out.println("Enter the height of triangle in cm : ");
		int base = sc.nextInt();
		
		// Calculating the area of the triangle 
		float areaCm = 0.5f * height * base;
		float areaInch = areaCm / 2.54f / 2.54f;

		// System.out.println(areaCm + " " + areaInch);

		System.out.println("Triangle having height " + height + " and base " + base + " has area in cm square : " + areaCm + " and in inch square : " + areaInch);

		sc.close();
	}
}