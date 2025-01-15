
import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
       
        // Input the string
        System.out.println("Enter two string: ");
        String str1 = input.next();
        String str2 = input.next();
       
        boolean result1 = str1.equals(str2);
        boolean result2 = getComparisionResult(str1, str2);
       
        System.out.println(result1 + " " + result2);
       
        if(result1 == result2)
            System.out.println("Reault are same from both methods.");
        else
            System.out.println("Reault are different from both methods.");  
    }
   
    private static boolean getComparisionResult(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
       
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) return false;
        }
       
        return true;
    }
}

