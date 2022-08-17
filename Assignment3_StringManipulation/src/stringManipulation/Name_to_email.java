package stringManipulation;

/**
 * Name_to_email.java
 * Name: Chris Walker
 * Date: February 22, 2022
 *
 *     Purpose: turns first and last name into a gmail 
 *     first three letters of the last name + last names length + the first two letters of the firstname + @gmail.com
 *     ex(bill gates = gat5bi@gmail.com
 *      
 * Methods:
 *     constructor - defauult lastname:"  ", firstname: "  ", constructor overload trims the input to get rid of unnecessary spaces and makes it lowercase
 *     toString - changes the string that the user inputed to pig latin
 */
public class Name_to_email {
	private String firstName, lastName;
	
	public Name_to_email() {
		this("   ", "   ");
	}
	public  Name_to_email(String fName, String lName){
		firstName = fName.trim().toLowerCase();
		if(firstName.length() < 3) {
			firstName += "____";
		}
		lastName = lName.trim().toLowerCase();
		if(lastName.length() < 3) {
			lastName += "____";
		}
	}
	
	public String toString() {
		// generates email
		return lastName.substring(0,3) + lastName.length() + firstName.substring(0, 2) + "@gmail.com";
	}
}
