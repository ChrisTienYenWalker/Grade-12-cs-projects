/*************************************************
//File name:  Weapons
//
//Purpose: Abstract weapon class
 * 
 *date: April 11, 2022
//functions:Constructors:
 * assigns color and name to variables
 * default: name = "" color = " " 
 * 
 * getters:
 * returns color, name and type respectively 
 * 
 * 
**************************************************/
package assigment6;

public abstract class Weapon {
	
	protected String color;
	protected String name;
	
	public Weapon() {
		this("", "");
	}
	public Weapon(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getType();
}
