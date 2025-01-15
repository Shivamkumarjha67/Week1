import java.util.Scanner;

class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store frequency of characters (ASCII range)
        int[] frequency = new int[256];

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
        }

        // Subtract the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            frequency[text2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true; // The texts are anagrams
    }
}
