import java.util.Scanner;

class CharacterFrequency {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the frequency of characters
        String[] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
         // Array to store frequency of characters
        int[] frequency = new int[characters.length];
        // Array to store characters and their frequencies
        String[] result = new String[characters.length]; 

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            // Skip if the character is already counted
            if (frequency[i] == 0) {
                frequency[i] = 1; 

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; 
                        frequency[j] = 0; 
                    }
                }
            }
        }

        // Fill the result array with characters and their frequencies
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            // Only consider characters with non-zero frequency
            if (frequency[i] > 0) { 
                result[index] = characters[i] + ": " + frequency[i];
                index++;
            }
        }

        // Resize the result array to remove unused slots
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }
}
