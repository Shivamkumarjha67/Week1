import java.util.Scanner;

public class LowercaseCoversionChecker {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
       
        String lowerConerted = str.toLowerCase();
        String lowerConerted2 = getLowerConvertedString(str);
       
        System.out.println("From both method resultant string is equal?: " + lowerConerted.equals(lowerConerted2));
       
        // Closing the scanner resource
        input.close();
    }

    // converting to upper case
    private static String getLowerConvertedString(String str) {
        char[] store = str.toCharArray();
       
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                store[i] = (char)(store[i] + 32);
            }
        }      

        return new String(store);
    }
}

