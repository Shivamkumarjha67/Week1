import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string and value to insert: ");
        String str = input.next();
       
        //genratingIllegalArgumentException(str);
        handlingIllegalArgumentException(str);
       
        // Closing the scanner resource
        input.close();
    }

    // Generating the string out of bound exception
    private static void genratingIllegalArgumentException(String str) {
        try {
            String substring = str.substring(4, 2);
        } catch(IllegalArgumentException e) {
            System.out.println("Illegal argument exception occured!");
        }      
    }
   
    // Handling the null pointer exception
    private static void handlingIllegalArgumentException(String str) {  
        try {
            String substring = str.substring(4, 2);
        } catch(IllegalArgumentException e) {
            System.out.println("Illegal argument exception occured!");
        } catch(RuntimeException e) {
            System.out.println("Runtime exception occured!");
        }
    }
}

