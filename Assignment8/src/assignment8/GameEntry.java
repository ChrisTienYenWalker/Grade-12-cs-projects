/*File name:  GameEntry

Purpose: Class blueprints for player data
 * 
 *date: April 20, 2022
functions:
Constructors(string, int):
 * sets score and name to inputs
 * sets nextlocation to null
 * 
 * Constructor(int , string):
 * returns an error message
 * 
 * getters: nextLocation, score, name
 * 
 * setNext: receives an object and sets nextlocation to the object entered
 * 
 * toString:
 * returns name and score in one line
 * 
**************************************************/

package assignment8;

public class GameEntry {
	
	//variables
	private int score; 
	private GameEntry nextLocation;
	private String name;
	
	//default constructor
	public GameEntry() {
		this("", 0);
	}
	
	//constructor overide
	public GameEntry(String name, int score) {
		this.score = score;
		this.name = name;
		nextLocation = null;
	}
	
	//error constructor
	public GameEntry(int i, String string) throws IllegalArgumentException  {
        throw new IllegalArgumentException("\nData entered incorrectly");
       }
	
	//sets object 
	public void setNext(GameEntry nextLocation) {
		this.nextLocation = nextLocation;
	}
	
	//returns object
	public GameEntry getNext() {
		return nextLocation;
	}
	
	//returns score
	public int getScore() {
		return score;
	}
	
	// return name
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	//returns name and score
	public String toString() {
		return name + " " + score;
	}


}
