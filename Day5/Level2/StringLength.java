import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
       
        // Taking the string as input
        System.out.println("Enter a string to get the length: ");
        String str = input.next();
       
        // Method calling and printing the result
        System.out.println("Length of the string is: " + getLength(str));
       
        // Closing the scanner object
        input.close();
    }
   
    // Method declaration for finding length after handling the runtime error
    private static int getLength(String str) {
        int length = 0;
       
        while(true) {
            try {
                str.charAt(length);
                length++;
            } catch(java.lang.StringIndexOutOfBoundsException e) {
                break;
            }
        }
       
        return length;
    }
}