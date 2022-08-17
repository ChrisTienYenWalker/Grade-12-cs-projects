/*************************************************
//File name:  Katana
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
public class Katana extends Weapon {
	
	public Katana(String color, String name) {
		super(color, name);
	}
	public String getType() {
		return "Katana";
	}
	
	public String toString() {
		return getName() + " " + getColor() + " " + getType() + " ";
	}
}
