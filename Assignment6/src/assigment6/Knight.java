/*************************************************
//File name:  Knight
//
//Purpose: Character Class
 * 
 *date: April 11, 2022
//functions:Constructors:
 * sends name, strength, battle weapon and points to warrior class
 * 
 * getters: strength, battleweapon, and points are in warrior class
 * 
 * toString: in warrior class 
 * 
 * loseStrength():
 * decreases strength by 0.25 times the input
 * 
 * gainStrength: increase strength by 0.25 times the input
 * 
**************************************************/

package assigment6;
public class Knight extends Warrior {

	public Knight(String name, int inputStrength, int inputPoints, Weapon battleWeapon) {
		super(name, inputStrength, inputPoints, battleWeapon);
	}

	@Override
	public void losesStrength(int pts) {
		// TODO Auto-generated method stub
		strength -= 0.25*pts;

	}

	@Override
	public void gainsStrength(int pts) {
		// TODO Auto-generated method stub
		strength += 0.25*pts;

	}


}
