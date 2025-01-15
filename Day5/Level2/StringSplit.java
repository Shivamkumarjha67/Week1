import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);
       
        // Taking the string as input
        System.out.println("Enter a string to get the length: ");
        String statement = input.nextLine();
       
        // Method calling and storing the returned values
        String[] firstArray = getWords(statement);
        String[] secondArray = statement.split("\\s+");
       
        // Printing the result of both array are equal or not
        System.out.println("Both array are equal: " + getComparisionResult(firstArray, secondArray));
       
        // Closing the scanner object
        input.close();
    }
   
    // Method declaration for finding length after handling the runtime error
    private static int getLength(String str) {
        int length = 0;
       
        while(true) {
            try {
                str.charAt(length);
                length++;
            } catch(java.lang.StringIndexOutOfBoundsException e) {
                break;
            }
        }
       
        return length;
    }
   
    // Method to split the statement passed
    private static String[] getWords(String statement) {
        int size = 1;
       
       
        for(int i=0; i<getLength(statement); i++) {
            if(statement.charAt(i) == ' ') size++;
        }
       
        // System.out.println(size);
        String[] words = new String[size];
        String word = "";
        int index = 0;
       
        for(int i=0; i<getLength(statement); i++) {
            if(statement.charAt(i) == ' ') {
                words[index] = word;
                index++;
                word = "";
            } else {
                word += statement.charAt(i);
            }
        }
       
        words[index] = word;
       
        return words;
    }
   
    // Method declaration for comapring two string array
    private static boolean getComparisionResult(String[] array1, String[] array2) {
        if(array1.length != array2.length) return false;
       
        for(int i=0; i<array1.length; i++) {
            if(!array1[i].equals(array2[i])) return false;
        }
       
        return true;
    }
}

