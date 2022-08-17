/*************************************************
//File name:  Mace
//
//Purpose: Abstract weapon class
 * 
 *date: April 11, 2022
//functions:Constructors:
 * Extends Weapon
 * 
 * getters:
 * returns color, name and type (these are in weapon class)
 * 
 * ToString: returns weapon description
 * 
 * 
**************************************************/

package assigment6;

public class Mace extends Weapon{
	
	public Mace(String color, String name) {
		super(color, name);
	}
	public String getType() {
		return "Mace";
	}
	
	public String toString() {
		return getName() + " " + getColor() + " " + getType() + " ";
	}
}
