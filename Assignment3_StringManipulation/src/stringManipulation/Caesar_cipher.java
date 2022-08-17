package stringManipulation;

/**
 * Caesar_cipher.java
 * Name: Chris Walker
 * Date: February 22, 2022
 *
 *     Purpose: you enter a sentence and all the words will be shifted over by 
 *     the amount(key) you want. Ex. if the key is 2 and the word is hello
 *     it will become jgnnq
 *      
 * Methods:
 *     constructor - default string is "", key is 0, constructor overload trims the input to get rid of unnecessary spaces and makes all the letters lower case
 *     toString - changes the string that the user inputed to the new phrase based on the key they want
 */
public class Caesar_cipher {
	private String userStringInput;
	private int key;
	
	public Caesar_cipher() {
		this("", 0);
	}
	public  Caesar_cipher(String string_input, int key_input){
		
		// set values
		userStringInput = string_input.toLowerCase().trim();
		key = key_input;
	}

	
	public String toString() {
		String caesarCipher_string = "";
		char letter;
		int letter_ascii_number;
		if(key > 26 || key < 26) {
			return "could not change, try a key between -26 and 26 ";
		}
		// cycles through every character
		for(int i = 0; i < userStringInput.length(); i++) {
			
			// turns character into it's ascii value
			letter_ascii_number = (int) userStringInput.charAt(i);
			
			// ascii values from 97 to 122 are all lower case letters
			if(letter_ascii_number >96 && letter_ascii_number < 123) {
				// if the ascii version of the character is a lowercase letter
				// ascii 'a' is 97 therefore you take the module of the number and subtract 19 to get 'a' then you add the key
				// this works for all character where if you subtract 19 and add the key to mod 26 it will give you your new character
				// this helps with bring looping when trying to add a positive key to 'z'. It will loop back to 'a'
				// then add 97 and bring it back to character form
				letter = (char)((letter_ascii_number - 19 + key)%26 + 97);
			}else {
				// if the character is a symbol or space their is no change
				letter = (char)letter_ascii_number;
			}
			
			// adds the character to the output string 
			caesarCipher_string = caesarCipher_string + letter;
		}
		return caesarCipher_string;
	}
}
