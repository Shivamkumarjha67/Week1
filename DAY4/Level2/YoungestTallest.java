import java.util.Scanner;

public class YoungestTallest {
	public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		String[] name = {"Amar", "Akbar", "Anthony"};
		
		// Taking input of height
		System.out.println("Enter the height of all three: ");
		int[] height = new int[3];
		
		for(int i=0; i<3; i++) {
			height[i] = input.nextInt();
		}
		
		// Taking input of age
		System.out.println("Enter the age of all three: ");
		int[] age = new int[3];
		
		for(int i=0; i<3; i++) {
			age[i] = input.nextInt();
		}
		
		YoungestTallest obj = new YoungestTallest();
		
		System.out.println("Youngest of the three is: " + name[obj.findYoungest(age)]);
		System.out.println("Tallest of the three is: " + name[obj.findTallest(height)]);
		
		// Closing scanner resurce
		input.close();
	}
	
	// Method Declaration for finding youngest
	public int findYoungest(int[] age) {
		if(age[0] < age[1] && age[0] < age[2]) return 0;
		else if(age[1] < age[2] && age[1] < age[0]) return 1;
		else return 2;
	}
	
	// Method Declaration for finding the tallest one
	public int findTallest(int[] height) {
		if(height[0] > height[1] && height[0] > height[2]) return 0;
		else if(height[1] > height[2] && height[1] > height[0]) return 1;
		else return 2;
	}
}