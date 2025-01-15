
import java.util.Scanner;

public class CompareCharacter {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
       
        // Input the string
        System.out.println("Enter a string of size grater than 5: ");
        String str = input.next();
       
        // Substring of index 1 to index 4
        char[] allCharacters1 = str.toCharArray();
        char[] allCharacters2 = getAllCharacter(str);
       
        System.out.println("Equal from both methods?: " + compareTwoArray(allCharacters1, allCharacters2));
    }
   
    private static boolean compareTwoArray(char[] allCharacters1, char[] allCharacters2) {              
        for(int i=0; i<allCharacters1.length; i++) {
            if(allCharacters1[i] != allCharacters2[i]) return false;
        }
       
        return true;
    }
   
    private static char[] getAllCharacter(String str) {    
        char[] allCharacter = new char[str.length()];
       
        for(int i=0; i<str.length(); i++) {
            allCharacter[i] = str.charAt(i);
        }
       
        return allCharacter;
    }
}

