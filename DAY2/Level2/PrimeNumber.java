import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter number : ");
        int num = input.nextInt();
	
	System.out.println(num + " is the Prime Number? : " + isPrime(num));

        input.close();
    }

    private static boolean isPrime(int num) {
	if(num < 1) return false;
	if(num == 2 || num == 3) return true;
	if(num % 2 == 0 || num % 3 == 0) return false;

	for(int i=5; i<=Math.sqrt(num); i+=6) {
		if(num % i == 0 || num % (i + 2) == 0) return false;
	}

	return true;
    }
}