/*************************************************
//File name:  Customer
//
//Purpose: customer class
 * 
 *date: April 4, 2022
//functions:Constructors:
 * default: name = Unkown; size = "Unkown; type="normal", drink="Unkown"
 * overloaded: takes in a string and splits on ", " then sets data
 * getters and setters for variables: name and status(type)
 * toString that outputs all variables
 * 
**************************************************/
package queueAssignment;

public class Customer {
	//variables
	private String size, drink, name, type;
	
	//constructors
	public Customer(){
		this("Unkown", "Unkown", "Unkown", "Normal");
	}
	public Customer(String inputSize, String inputDrink, String inputName, String inputType){
		size = inputSize;
		drink = inputDrink;
		name = inputName;
		type = inputType;
	}
	
	//getters
	public String getName(){
		return name;
	}
	public String getStatus() {
		return type;
	}
	
	
	public String toString() {
		return name + ": " + drink + " " + size + " "+ type;
	}
}
