package ducks;
import java.util.Scanner;

public class DuckCalc {
	public void drawDucks() {
		String head = " >(') ___,  ";
		String body = "  (` =~~/   ";
		String feet = "^~^`---'~^~^~";
		String duck = head +'\n'+body+'\n'+feet; 
		
		System.out.print("say something");
		String value = new Scanner(System.in).nextLine();
		System.out.println(value);
	}
}
