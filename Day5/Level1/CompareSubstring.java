import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
       
        // Input the string
        System.out.println("Enter a string of size grater than 5: ");
        String str = input.next();
       
        // Substring of index 1 to index 4
        String subString1 = str.substring(1, 4);
        String substring2 = getSubstring(str, 1, 4);
        boolean result = subString1.equals(substring2);
   
        System.out.println("Equal substring from both methods?: " + result);
    }
   
    private static String getSubstring(String str, int start, int end) {        
        String substring = "";
       
        for(int i=start; i<end; i++) {
            substring += str.charAt(i);
        }
       
        return substring;
    }
}

