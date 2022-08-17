package assigment6;
import java.util.*;

/**
 * Player.java - class to determine which avatar to choose.
 * @author Tunde Forrest
 */

public class Player {
    private int lives;
    private Avatar character; 
    private Weapon wpn;

    public Player() {
        lives = 3;
        chooseAvatar();
    }

	public void chooseAvatar() {
        System.out.println("Please choose one of the following: Wizard or Warrior");
        Scanner in = new Scanner(System.in);
        String choice= in.nextLine();

        // insert strength then points in constructors
        if(choice.equals("Wizard")) {
            System.out.println("Please enter the Wizards name:");
            String name = in.nextLine();
            System.out.println("Please enter the Weapon type: Staff or Wand:");
            String weaponType = in.nextLine();
            System.out.println("Please enter the Weapon name:");
            String weaponName = in.nextLine();
            System.out.println("Please enter the Weapon color:");
            String weaponColor = in.nextLine();
            if(weaponType == "Staff") {
            	wpn = new Staff(weaponName, weaponColor);
            }
            else {
            	wpn = new Wand(weaponName, weaponColor);
            }
            character = new Wizard(name, 500, 500, wpn);
        } else {
            System.out.println("Please enter one of the following: Ninja or Knight");
            String option = in.nextLine();
            if (option.equals("Ninja")) {
                System.out.println("Please enter the Weapon type: Shuriken or Katana:");
                String weaponType = in.nextLine();
                System.out.println("Please enter the Weapon name:");
                String weaponName = in.nextLine();
                System.out.println("Please enter the Weapon color:");
                String weaponColor = in.nextLine();
                if(weaponType == "Katana") {
                	wpn = new Katana(weaponName, weaponColor);
                }
                else {
                	wpn = new Shuriken(weaponName, weaponColor);
                }
                character = new Ninja("Black Viper", 400, 600, wpn);
            }
            else {
                System.out.println("Please enter the Weapon type: Mace or Sword:");
                String weaponType = in.nextLine();
                System.out.println("Please enter the Weapon name:");
                String weaponName = in.nextLine();
                System.out.println("Please enter the Weapon color:");
                String weaponColor = in.nextLine();
                if(weaponType == "Mace") {
                	wpn = new Mace(weaponName, weaponColor);
                }
                else {
                	wpn = new Sword(weaponName, weaponColor);
                }
                character = new Knight("Sir Slash", 600, 400, wpn);
            }
        }
        //in.close();
    }
    
    public void loseLife() {
        lives-=1;
    }
    
    public void gainLife() {
        lives +=1;
    }
    
    public void gainsPoints(int pts) {
        character.gainsStrength(pts);
    }
    
    public void losePoints(int pts) {
        character.losesStrength(pts);
    }
    
    public Avatar getCharacter() {
        return character;
    }

    public String toString() {
        String str = "";
        str += "The character is " + character;
        str += "Number of lives is: " + lives + "\n";
        return str;
                
    }
}

