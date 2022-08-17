package McDonalds;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

//			Mcdonalds ordering system
//			Choices are drinks, burgers, sides and combos
//			Drinks and sides come in sizes
//			Burgers come with customization
//			adds the total prices of the product at the end of the order
//			you have the option to add, delete and see your products
//			Combos have a $2 discount
//
public class McDonalds_interface {
	private static BufferedReader inputStream = new BufferedReader(new 	InputStreamReader(System.in));
	
	// Get an integer from the user and return it 
	//makes sure the application doesn't break when you type in character instead of a number
		public static int getInteger() {
		try {
			return(Integer.valueOf(inputStream.readLine().trim()).intValue());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	// making double two decimals (used in total and hst calculations and in combo)
	private static final DecimalFormat makeDecimal = new DecimalFormat("0.00");
	
	public static void main(String args[]) {
		
		// break the while loop at end the order
		int endOrder = 1;
		
		//array list to track order and cost 
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<Double> $cost = new ArrayList<Double>();
		
		// track the number of orders there are so that you won't be able to delete or look at orders without any items
		int numberOfItems = 0;

		Mains getMains = new Mains();

		System.out.println("What would you like(Enter number corresponding to your choice) : 1.Combo, 2.Burger 3.Side 4.Drinks 9.EndOrder");
		
		do {
			
			int OrderChoice = getInteger(); 

			switch(OrderChoice) {
			case 1:
				
				// goes through case 2, 3 and 4 in one order
				double $comboCost = 0.00;
				String burger = getMains.burgerOrder();
				
				// adds cost to combocost and deletes cost from strings
				$comboCost += Double.valueOf(burger.substring(1,5));
				burger = burger.substring(6, burger.length());

				String side = getMains.askSides();
				
				// adds cost to combocost and deletes cost from strings
				$comboCost += Double.valueOf(side.substring(side.length() - 4, side.length()));
				side = side.substring(0, side.length() - 5);


				String drink = getMains.askDrink();

				
				// adds cost to combocost and deletes cost from strings
				$comboCost += Double.valueOf(drink.substring(drink.length() - 4, drink.length()));
				System.out.println(drink.substring(drink.length() - 4, drink.length()));
				
				drink = drink.substring(0, (drink.length() - 5));
				
				//get and remove cost attached to burgers
				String Combo = "Combo of " + burger + "w " + side + "and " + drink;
				System.out.println(Combo);
//				$cost.add(Double.valueOf(order.get(order.size()-1).substring(1,4)));
				//discount
				System.out.println("Combo discount: -$2.00");
				System.out.println("$" + makeDecimal.format($comboCost - 2));
				
				// save to array list
				order.add(Combo + " $" + $comboCost);
				$cost.add($comboCost);
				break;
			case 2:
				// burger order and adding it to the array list
				order.add(getMains.burgerOrder());
				
				// show what they ordered
				if(order.get(order.size()-1) != null) {
					System.out.println(order.get(order.size()-1));

				//add cost to array list by taking the end of the string(where the cost is shown) and turn it into an amount
				$cost.add(Double.valueOf(order.get(order.size()-1).substring(1,5)));
				}

				break;
			case 3: 
				order.add(getMains.askSides());


				//don't add cost if null or print out null
				if(order.get(order.size()-1) != null) {
					
					System.out.println(order.get(order.size()-1));

					//add cost to array list by taking the end of the string(where the cost is shown) and turn it into an amount
					$cost.add(Double.valueOf(order.get(order.size()-1).substring(order.get(order.size()-1).length() - 4)));
				}
				
				break;
			case 4:
				order.add(getMains.askDrink());
				
				//don't add cost if null or print out null
				if(order.get(order.size()-1) != null) {
					
					System.out.println(order.get(order.size()-1));

					//add cost to array list by taking the end of the string(where the cost is shown) and turn it into an amount
					$cost.add(Double.valueOf(order.get(order.size()-1).substring(order.get(order.size()-1).length() - 4)));
				}
				break;
			case 5: 
				// checks if they have items
				if(numberOfItems > 0) {
					
					//displays orders 
					for (String i : order) {
				      System.out.println(i);
					}
					
					// calculate total cost
					Double $total = 0.00;
					for (Double i : $cost) {
					     $total += i;
					}
					System.out.println("Total: " + $total);
				}
				
				break;
			case 6: 
				
				//check if there are items to delete
				if(numberOfItems > 0) {
					
					// ask what they want to delete
					System.out.println("Choose the number of the item you want to delete");
					int k = 1;
				    System.out.println("None : 0");
					for (String i : order) {
				      System.out.println(k + ": " + i);
				      k++;
					}
					int deleteItem = getInteger();
					
					// leave loop if they don't want to delete an item
					if(deleteItem == 0) {
						break;
					}
					
					// delete item and it's cost
					order.remove(deleteItem - 1);					
					$cost.remove(deleteItem - 1);
					numberOfItems--;
				}
				break;

			case 9:
				endOrder = 0;
				break;
			}
			
			// if their order was a error the class will return null
			// this deletes null
			if(OrderChoice > 0 && OrderChoice < 5) {
				if(order.get(order.size()-1) == null) {
					order.remove(order.size()-1);
					numberOfItems--;
				}	
				numberOfItems++;
			}
			
			if(endOrder ==  1) {
				System.out.println("Would you like anything else(Enter number corresponding to your choice) : 1.Combo, 2.Burger 3.Side 4.Drinks 5.Look at Order 6.Delete Order 9.EndOrder");
			}
			
			
		}while(endOrder == 1);
      
		//checks if they have a order
		if(order.size() > 0) {
			System.out.println("Your final order is");
			
			//loads all items
			for (String i : order) {
			      System.out.println(i);
			    }
			// finds price
			Double $total = 0.00;
			for (Double i : $cost) {
			     $total += i;
			}
			
			//final price calculations 
			System.out.println("Total: " + makeDecimal.format($total));
			System.out.println("HST: " + makeDecimal.format($total * 0.13));
			System.out.println("Final Total: " + makeDecimal.format($total*1.13));

		}
			System.out.println("Thank You, Come Again");
		
	}
}
