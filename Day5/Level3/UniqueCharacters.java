import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = stringLength(str);
        char[] uniqueChars = findUniqueCharacters(str, length);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            // Print only non-null characters
            if (c != '\0') { 
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }

    // Calculate string length without using String.length()
    public static int stringLength(String str) {
        int length = 0;
        while (str.charAt(length) != '\0') {
            length++;
        }
        return length;
    }

    // Find unique characters in a string
    public static char[] findUniqueCharacters(String str, int length) {
        // Array to store unique characters
        char[] uniqueChars = new char[length]; 
        int uniqueCount = 0; 

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = str.charAt(i);
            }
        }

        return uniqueChars;
    }
}