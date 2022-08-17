/*************************************************
//File name:  Ninja
//
//Purpose: Character Class
 * 
 *date: April 11, 2022
//functions:Constructors:
 * sends name, strength battleItem and points to warrior class
 * 
 * getters: strength points and weapon are in warrior class
 * 
 * toString: in warrior class 
 * 
 * loseStrength():
 * decreases strength by 0.7 times the input
 * 
 * gainStrength: increase strength by 0.7 times the input
 * 
**************************************************/

package assigment6;
public class Ninja extends Warrior {

	public Ninja(String name, int inputStrength, int inputPoints, Weapon battleItem) {
		super(name, inputStrength , inputPoints, battleItem);
	}

	@Override
	public void losesStrength(int pts) {
		// TODO Auto-generated method stub
		strength -= 0.7 *pts;

	}

	@Override
	public void gainsStrength(int pts) {
		// TODO Auto-generated method stub
		strength += 0.7 *pts;
	}

}
