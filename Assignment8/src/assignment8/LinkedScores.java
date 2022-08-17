/*File name:  LinkedScores

Purpose: deals with the UI and the linked list
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

public class LinkedScores {
	
	//start of the linked list
	private GameEntry head = null;
	
	
	//adds a new input to the linkedlist
	public void add(GameEntry gameEntry) {
		
		//if the linklist is empty assign the input to the beginning of the linked list
		if(head == null) {
			head = gameEntry;
		}
		
		// if the linked list isn't empty
		else {
			
			//set the first node to the head
			GameEntry node = head;
			
			//if the linked list only has one object
			if(head.getNext() == null) {
				
				//if the input is less then the head add the element to the end of the linked list
				if(head.getScore() > gameEntry.getScore()) {
					gameEntry.setNext(node.getNext()); 
					node.setNext(gameEntry);
				}
				//if the input is greater set the input as the head and the input's nextlocation to be the old head
				else {
					gameEntry.setNext(node);
					head = gameEntry;
				}
			}
			else {
				
				//expose to be set to the node before so that the node can be inserted between the elements in the linkedlist
				GameEntry b = node;
				//loop until end end of the linkedlist
				while(node.getNext() != null) {
					
					//check if the score is bigger than the previous one
					if(node.getScore() < gameEntry.getScore()) {
						
						// the input will point to the node that was just compared
						gameEntry.setNext(node); 
						
						//if it's the first element set the head to the input
						if(node == head) {
							head = gameEntry;
						}
						
						//if not get the previous element in the linkedlist to point towards the element
						else {
							b.setNext(gameEntry);
						}
						break;
					}
					//if it's not the start of the linkedlist 
					if(node!=head){
					 b = node;	
					}
					// go to the next element in the linkedlist
					node = node.getNext();
					
				}
				//if we got to the end of the linkedlist and couldn't find a place into insert(score was the smallest)
				//at the end add the last one
				if(node.getNext() == null) {
					gameEntry.setNext(node.getNext()); 
					node.setNext(gameEntry);
				}
			}
		}
	}

	//removes a entry from the linkedlist based on name
	public void remove(String name) {
		GameEntry node = head;
		//checks if the head has the same name as the input
		if(head.getName() == name) {
			//starts the linkedlist at the next element
			head = head.getNext();
		}
		
		// cycles through the linkedlist looking 
		while(node.getNext() != null) {
			
			// check the next element's name if it's equal
			if(name == node.getNext().getName()) {
				// if it is set this node's next element to the next's element get location
				//it skips that element in the linkedlist
				node.setNext(node.getNext().getNext());
			}
			node = node.getNext();
		}
	}
	
	// outputs the first five elements in the linkedlist
	public String toString() {
		String output = "";
		GameEntry node = head;
		// get the toString of the first five elements in the linkedlist
		for(int i = 0; i < 5; i ++) {
			output = output + node.toString() + " ";
			node =node.getNext();
		}
		return output;
	}

	//gets the number of elements in the linkedlist
	public int getNumEntries() {
		GameEntry node = head;
		int counter = 1;
		
		//while there are more elements in the linkedlist add 1 to the counter
		while(node.getNext() != null) {
			counter ++;
			node = node.getNext();
		}
		return counter;
	}

}
