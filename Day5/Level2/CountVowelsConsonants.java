
import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Input Line from user
		System.out.print("Enter text: ");
		String text = input.nextLine();  
		
		//Call method to get the result
		int[] result = getCount(text);
		
		//Output
		System.out.println("Number of vowels: "+result[0]);
		System.out.println("Number of consonants: "+result[1]);
	
		input.close();
	}
	
	// Method to check a word is vowel or a consonant
	public static boolean isVowel(char ch) {
		//Coverting character to lowerCase
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// Condition for checking ch is a vowel or not
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		else {
			return false; 
		}
	}
	
	// Method to check not a alphabet
	public static boolean isAlphabet(char ch) {
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// Condition for checking the charater is alphabet
		if(ch >= 97 && ch <= (97+25)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Method to count number of vowels and consonants in a text
	public static int[] getCount(String text) {
		int countVowels = 0;  
		int countConsonants = 0; 
		int[] result = new int[2];  
		
		// iterate through each character to check its a vowel or a consonant
		for(int i=0; i<text.length(); i++) {
			if(isVowel(text.charAt(i))) {
				countVowels++;    
			}
			else if(isAlphabet(text.charAt(i))) {
				countConsonants++; 
			}
		}
		result[0] = countVowels;    
		result[1] = countConsonants;
		
		return result;
	}
}

