package rectangle;
import java.util.Scanner;

public class DrawRectangle {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online
	    public static void main(String[] args) {
	        int highest;
	        int numInput;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a number");
	        highest = input.nextInt();

	        for(int i = 1; i < 10; i++){
	            System.out.println("Enter a number");
	            numInput = input.nextInt();

	            if(highest < numInput){
	                highest = numInput;
	            }
	            
	        }
	        System.out.println("highest num = " + highest);
	    }
	
}
