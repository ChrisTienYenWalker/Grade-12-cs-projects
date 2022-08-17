/*************************************************
//File name:  Warrior
//
//Purpose: Character Class
 * 
 *date: April 11, 2022
//functions:Constructors:
 * sends name to avatar class
 * assigns strength, battleweapon and points to variables
 * default: name = "Unknown" points: 0, strength: 0
 * 
 * getters:
 * returns strength weapon and points respectively 
 * 
 * toString: returns name
 * 
 * loseStrength():
 * decreases strength by 0.5 times the input
 * 
 * gainStrength: increase strength by 0.5 times the input
 * 
**************************************************/

package assigment6;
public abstract class Warrior extends Avatar {
	int strength, points;
	Weapon battleWeapon;

	public Warrior() {
		super("Unkown");
		strength = 0;
		points = 0;
	}
	
	public Warrior(String name, int inputStrength, int inputPoint, Weapon battleWeapon) {
		super(name);
		this.battleWeapon = battleWeapon;
		strength = inputStrength;
		points = inputPoint;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return strength;
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public void losesStrength(int pts) {
		// TODO Auto-generated method stub
		strength -= 0.5*pts;
	}

	@Override
	public void gainsStrength(int pts) {
		// TODO Auto-generated method stub
		strength += 0.5*pts;

	}
	
	public Weapon getWeapon() {
		return battleWeapon;
	}
	public String toString() {
		return getName() + " " + "Weapon: " + getWeapon();
	}
}
