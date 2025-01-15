import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string and value to insert: ");
        String str = input.next();
       
        genratingNumberFormatException(str);
        handlingNumberFormatException(str);
       
        // Closing the scanner resource
        input.close();
    }

    // Generating the string out of bound exception
    private static void genratingNumberFormatException(String str) {    
        try {
            int number = Integer.parseInt(str);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception occured!");
        }      
    }
   
    // Handling the null pointer exception
    private static void handlingNumberFormatException(String str) {
        try {
            String substring = str.substring(4, 2);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception occured!");
        } catch(RuntimeException e) {
            System.out.println("Runtime exception occured!");
        }
    }
}

