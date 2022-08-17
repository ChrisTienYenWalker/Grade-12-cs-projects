/*************************************************
//File name: Queue
//
//Purpose: Runs the functions for the UI
 * 
 * date: April 4, 2022
//functions:Constructors:
 * constructor: for arraylist
 * enqueue: adds order to array list
 * dequeue: sends out order from arraylist and deletes that item from array list
 * isFull/isEmpty checks if array is full/empty
 * remove: deletes all orders with name input
 * setPriority: adds a vip order near the beginning of the list
 * size: outputs arraylist size
 * 
**************************************************/
package queueAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
	
	//creates an empty array list
	private ArrayList<Customer> OrderList;
	Scanner input= new Scanner(System.in);
	
	public Queue() {
		 OrderList = new ArrayList<Customer>();
	}
	
	
	//add order
	public void enqueue() {
		
		//checks if order is full
		if(isFull()) {
			System.out.print("we can't take your order right now");
		}
		else {
			
			// adds order
			System.out.print("Hello, what drink would you like to order: ");
			String drink = input.nextLine();
			System.out.print("What size would you like: ");
			String size = input.nextLine();
			System.out.print("What is your name: " );
			String name = input.nextLine();
			OrderList.add(new Customer(size, drink, name, "normal"));
		}

	}
	
	//sends out order
	public void dequeue() {
		// checks if there are any orders
		if(!isEmpty()) {
			System.out.print("Order for " + OrderList.get(0));
			OrderList.remove(0);
		}
		else {
			System.out.println("No orders found");
		}
	}
	
	//checks if order is full
	// full is when there are more then 10 orders
	public Boolean isFull() {
		if(OrderList.size() > 10) {
			return true;
		}
		return false;
	}
	
	//checks if order is empty
	//empty is when the list is 0
	public Boolean isEmpty() {
		if(OrderList.size() == 0) {
			return true;
		}
		return false;
	}
	
	//removes order from list
	public void remove() {
		
		// ask data
		System.out.print("What is your name: " );
		String name = input.nextLine();
		
		//checks the order list to find the first order with that name 
		// then deletes all orders with that name
		for(int i = 0; i < OrderList.size(); i++) {
			if(name.equals(OrderList.get(i).getName())) {
				OrderList.remove(i);
				System.out.print("deleted order\n");
			}
		}
		System.out.println("deleted all orders with that name");
	}
	
	//vip order
	public void setPriority() {
		//ask for inputs
		System.out.print("Hello, what drink would you like to order: ");
		String drink = input.nextLine();
		System.out.print("What size would you like: ");
		String size = input.nextLine();
		System.out.print("What is your name: ");
		String name = input.nextLine();
		
		//it will add to the front of the line is the orderlist is empty
		if(OrderList.size() == 0) {
			OrderList.add(new Customer(size, drink, name, "VIP"));
		}
		
		// adds to the front of the order list behind the last vip entry
		for(int i = 0; i < OrderList.size();  i++) {
			if(OrderList.get(i).getStatus().equals("normal")) {
				OrderList.add(i, new Customer(size, drink, name, "VIP"));
				break;
			}
		}

	}
	
	// displays the whole arraylist 
	public String toString() {
		String displayString = "";
		
		//sorts through each item in the list
		for(int i = 0; i < OrderList.size(); i++) {
			displayString += i + ": " + OrderList.get(i).toString() + "\n";
		}
		return displayString;
	}

	public void size() {
		System.out.print(OrderList.size() + "\n");
	}
}
