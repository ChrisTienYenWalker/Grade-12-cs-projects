/*************************************************
//File name:  UI
//
 * date: April 4, 2022
//Purpose: Coffee shop UI 
 * Does multiple task:
 * adds order, deletes order, checks queue, serves order, shows queue, checks size of queueadds VIP order
**************************************************/
package queueAssignment;
import java.util.Scanner;
public class UI {
	public static void main(String args[]) {
		Queue displayQueue = new Queue();
		
		//Continues to play while true
		Boolean stillPlaying = true;
		
		//asks user what file they want to read
		Scanner input= new Scanner(System.in);
		
		//options with a switch Statement
		do {
			System.out.println("\n1: Add Order, 2: Delete Order, 3: Check Queue(empty), 4: Check Queue(full), 5: Serve Order, \n6: Show Queue 7: Size of Queue 8: VIP Order 9: Leave \nEnter a number: ");
			int choice = input.nextInt();
			switch(choice){
			case 1:
				
				//adds order
				displayQueue.enqueue();
				break;
			case 2:
				
				//deletes order
				displayQueue.remove();
				break;
			case 3:
				
				//checks queue
				//queue returns boolean
				if(displayQueue.isEmpty()) {
					System.out.println("Queue is empty");
				}
				else {
					System.out.println("Queue is not empty");
				}
				break;
			case 4: 
				
				//checks queue
				//queue returns boolean
				if(displayQueue.isFull()) {
					System.out.println("Queue is full");
				}
				else {
					System.out.println("Queue is not full");
				}
				break;
			case 5: 
				
				//delete order
				displayQueue.dequeue();
				break;
				
				// you can check if it sorted properly 
			case 6: 
				System.out.println(displayQueue);
				break;
			case 7:
				displayQueue.size();
				break;
			case 8:
				//add vip
				displayQueue.setPriority();
				break;
			case 9:
				stillPlaying = false;
				break;
			}
				
		}while(stillPlaying);
	}
}