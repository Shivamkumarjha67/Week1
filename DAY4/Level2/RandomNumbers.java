import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
		// Initializing the scanner object
        Scanner input = new Scanner(System.in);

		// Initializing the size of each digits
        int size = 4;
		RandomNumbers obj = new RandomNumbers();
		
		// getting array of random numbers
		int[] numbers = obj.generate4DigitRandomArray(size);
		
		for(int i=0; i<5; i++) {
			System.out.println("Numbers are: " + numbers[i]);
		}
		
		// finding the average, min and max
		double[] result = obj.findAverageMinMax(numbers);
		
		System.out.println("Average of numbers is: " + result[0] + "\nMinimum of numbers is: " + result[1] + "\nMaximum of numbers is: " + result[2]);

		// Closing the scanner resource
        input.close();
    }
	
	// Method declarations
	public int[] generate4DigitRandomArray(int size) {
		int[] numbers = new int[5];
		
		for(int i=0; i<5; i++) {
			numbers[i] = (int)(Math.random() * 10000);
		}
		
		return numbers;
	}
	
	public double[] findAverageMinMax(int[] numbers) {
		double average = 0.0;
		
		for(int i=0; i<5; i++) {
			average += numbers[i];
		}
		
		average /= 5.0;
		
		int minm = numbers[0];
		int maxm = numbers[0];
		
		for(int i=1; i<5; i++) {
			minm = Math.min(minm, numbers[i]);
			maxm = Math.max(maxm, numbers[i]);
		}
		
		return new double[]{average, minm, maxm};
	}
}