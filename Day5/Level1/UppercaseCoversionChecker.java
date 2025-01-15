import java.util.Scanner;

public class UppercaseCoversionChecker {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
       
        String upperConerted = str.toUpperCase();
        String upperConerted2 = getUpperConvertedString(str);
       
        System.out.println("From both method resultant string is equal?: " + upperConerted.equals(upperConerted2));
       
        // Closing the scanner resource
        input.close();
    }

    // converting to upper case
    private static String getUpperConvertedString(String str) {
        char[] store = str.toCharArray();
       
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                store[i] = (char)(store[i] - 32);
            }
        }      

        return new String(store);
    }
}

