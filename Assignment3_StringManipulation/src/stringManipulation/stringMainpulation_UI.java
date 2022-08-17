package stringManipulation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * stringMainpulation_UI.java
 * Name: Chris Walker
 * Date: February 22, 2022
 *
 *     Purpose: UI for string modification options
 *     
 *     functions: it loops while the user doesn't type the exit number(0) it offers three options:
 *     1: turn a string into caesar cipher
 *     2: turn a string into pig latin
 *     3: turn a name into an email
 */
public class stringMainpulation_UI {

	private static BufferedReader inputStream = new BufferedReader(new 	InputStreamReader(System.in));

	// makes sure when they don't enter an expected value the system doesn't crash
	public static int getInteger() {
		try {
			return(Integer.valueOf(inputStream.readLine().trim()).intValue());
		} catch (Exception e) {
//			e.printStackTrace();
			return 0;
		}	
	}
	
	public static String getString() {
		try {
			return inputStream.readLine();
		} catch (Exception e) {
//			e.printStackTrace();
			return " ";
		}
	}
	
	public static void main(String args[]) {
		
		int ask;
		
		// do while loop with 4 options
		do {
		System.out.println("Options: 1: Caesar Cipher, 2: Pig Latin, 3: Generate an email, 0 to exit");
		ask = getInteger();
		// switch statement with it's options 
		switch(ask){
		case 0: 
			System.out.println("GoodBye");
			break;
		case 1:
			// asks what string they want to make modify and the key they want to use
			System.out.println("What word would you like to make into caesar cipher");
			
			String caesarCipher_word = getString();
			System.out.println("What number key value would you like to use");
			int caesarCipher_key = getInteger();

			
			//generates object and uses the methods within the object
			Caesar_cipher object_caesarCipher = new Caesar_cipher(caesarCipher_word, caesarCipher_key);
			System.out.println(object_caesarCipher);
			break;
			
		case 2:
			
			System.out.println("What word would you like to learn in Pig Latin");
			String pigLatin_word = getString();
			
			//generates object and uses the methods within the object
			Pig_latin object_pigLatin = new Pig_latin(pigLatin_word);
			System.out.println(object_pigLatin);
			break;
		case 3:
			
			System.out.println("Enter First Name: ");
			String firstName = getString();
			
			System.out.println("Enter last Name: ");
			String lastName = getString();

			//generates object and uses the methods within the object
			Name_to_email nameEmail = new Name_to_email(firstName, lastName);
			System.out.println(nameEmail);
			break;
			
		default:
			System.out.println("Not an option");
			break;
		}
		
		}while(ask != 0);
	}
}
