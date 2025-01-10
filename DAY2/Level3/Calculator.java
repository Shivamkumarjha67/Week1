import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two number
        System.out.print("Enter two integer: ");
        int num1 = input.nextInt();
	int num2 = input.nextInt();

	// Input the type of operation
	System.out.print("Enter the operation you want to perform: ");
	char op = input.next().charAt(0);

        // Calculating the result
	//long total1 = 0;
	//long total2 = 0;

	//for(int i=1; i<=num1; i++) {
	//	total1 += i;
	//}

	//for(int i=1; i<=num2; i++) {
	//	total2 += i;
	//}

	//System.out.println("Sum of numbers upto 1 equals num1 and num2 respectively: " + total1 + " , " + total2);

	long result;
	
	switch(op) {
		case '+': result = num1 + num2;
			  System.out.println(result);
			  break;
		case '-': result = num1 - num2;
			  System.out.println(result);
			  break;
		case '*': result = num1 * num2;
			  System.out.println(result);
			  break;
		case '/': result = num1 / num2;
			  System.out.println(result);
			  break;
		default: System.out.println("Invalid operation!");
	}
        

        input.close();
    }
}
