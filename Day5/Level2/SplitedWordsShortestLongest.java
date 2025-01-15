
import java.util.Scanner;
import java.util.Arrays;

public class SplitedWordsShortestLongest {
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
       
        String[] longestShortest = getLongestShortest(wordsLength);
       
        System.out.println("Longest word is: " + longestShortest[0] + " shortest word is: " + longestShortest[1]);
       
        // Closing the scanner resource
        input.close();
    }
   
    // Finding the shortest and longest strings
    private static String[] getLongestShortest(String[][] wordsLength) {    
        String[] result = new String[2];
        int longest = 0, shortest = Integer.MAX_VALUE;
       
        for(int i=0; i<wordsLength.length; i++) {
            int length = Integer.parseInt(wordsLength[i][1]);
           
            if(longest < length) {
                longest = length;
                result[0] = wordsLength[i][0];
            }
           
            if(shortest > length) {
                shortest = length;
                result[1] = wordsLength[i][0];
            }
        }
       
        return result;
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

