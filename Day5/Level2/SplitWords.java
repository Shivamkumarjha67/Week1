
import java.util.Scanner;
import java.util.Arrays;

public class SplitWords {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
       
        // Taking the input
        System.out.println("Enter a string: ");
        String statement = input.nextLine();
       
        // Operation of spliting word and storing it
        String[] words = getSplittedWords(statement);
        // Storing the string along with it's length
        String[][] wordsLength = getStringAndLength(words);
               
        for(String[] str : wordsLength) {
            System.out.println(str[0] + " length is: " + str[1]);
        }
       
        // Closing the scanner resource
        input.close();
    }

    // spliting the word from line
    private static String[] getSplittedWords(String statement) {    
        String[] words = new String[0];
        String word = "";
        int length = 0;
       
        for(int i=0; i<statement.length(); i++) {
            if(statement.charAt(i) != ' ') {
                word += statement.charAt(i);
            } else if(word.length() != 0) {
                length = words.length + 1;
                String[] temp = Arrays.copyOf(words, length);
                temp[length - 1] = word;
                words = temp;
                word = "";
            }
        }
       
        if(word.length() != 0) {
            length = words.length + 1;
            String[] temp = Arrays.copyOf(words, length);
            temp[length - 1] = word;
            words = temp;
        }
       
        return words;
    }
   
    // Finding the length of string
    private static String getLength(String str) {  
        int length = 0;
       
        for(char c : str.toCharArray()) {
            length++;
        }
       
        return String.valueOf(length);
    }
   
    // Combining the word along with it's length
    private static String[][] getStringAndLength(String[] words) {  
        String[][] wordsLength = new String[words.length][2];
        int index = 0;
       
        for(String str : words) {
            wordsLength[index][0] = str;
            wordsLength[index][1] = getLength(str);
            index++;
        }
       
        return wordsLength;
    }
}

