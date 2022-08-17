/*************************************************
//File name:  Wizard
//
//Purpose: Character Class
 * 
 *date: April 11, 2022
//functions:Constructors:
 * sends name to avatar class
 * assigns strength battleweapon and points to variables
 * 
 * getters:
 * returns strength points and weapon respectively 
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

public class Wizard extends Avatar {

	int strength, points;
	Weapon battleWeapon;
	
	public Wizard(String name, int inputStrength, int inputPoints, Weapon battleWeapon) {
		super(name);
		this.battleWeapon = battleWeapon;
		strength = inputStrength;
		points = inputPoints;
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
	public String toString() {
		return getName() + " " + "Weapon: " + getWeapon();
	}

	@Override
	public Weapon getWeapon() {
		// TODO Auto-generated method stub
		return battleWeapon;
	}

}
