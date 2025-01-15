import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string and value to insert: ");
        int[] array = new int[5];
       
        for(int i=0; i<5; i++) {
            array[i] = input.nextInt();
        }
       
        // genratingArrayIndexOutOfBoundsException(array);
        handlingArrayIndexOutOfBoundsException(array);
       
        // Closing the scanner resource
        input.close();
    }

    // Generating the string out of bound exception
    private static void genratingArrayIndexOutOfBoundsException(int[] array) {  
        System.out.println("Element at index 5 is: " + array[5]);      
    }
   
    // Handling the null pointer exception
    private static void handlingArrayIndexOutOfBoundsException(int[] array) {  
        try {
            System.out.println("Element at index 5 is: " + array[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
        }  
    }
}

