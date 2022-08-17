package stringManipulation;
/**
 * Pig_latin.java
 * Name: Chris Walker
 * Date: February 22, 2022
 *
 *     Purpose: Turns word into pig latin, Takes the first letter of a word
 *     and places it at the end of the word then adds "ay" 
 *      
 * Methods:
 *     constructor - defauult value is "", constructor overload trims the input to get rid of unnecessary spaces
 *     toString - changes the string that the user inputed to pig latin
 */

public class Pig_latin {
	private String nonLatinString;
	
	public Pig_latin() {
		this("");
	}
	public  Pig_latin(String input){
		input.trim();
		nonLatinString = input;
	}

	// takes a string and makes the first letter of the string a capital
	public static String capitalize(String input) {

	    return input.substring(0, 1).toUpperCase() + input.substring(1, input.length());
	}
	
	public String toString() {
		String pigLatin_output = "";
		if(nonLatinString.isEmpty()) {
			return "Not a word";
		}
		
		// creates an array where each value is a different word
		// words are determined by a separation of a space
		String[] pig_latin_array = nonLatinString.split(" ");
		
		// goes through each word
		for(int i = 0; pig_latin_array.length > i; i++) {
			
			// using substring, takes the string from the second character to the end of the string
			// then adds the first character of the original string
			// then adds "ay" at the end
			pigLatin_output +=  pig_latin_array[i].substring(1,pig_latin_array[i].length()).toLowerCase() + Character.toLowerCase(pig_latin_array[i].charAt(0)) + "ay ";
			
		}
		return capitalize(pigLatin_output);
	}
}
	
