package McDonalds;
import java.io.*;
import java.io.InputStreamReader;

// 
//		All the food option functions
//			Drinks, Burgers and Sides
//
//		gets user to input numbers or letters to choose their food and size
//		returns a string(their order) with a price 
//

public class Mains {
	private static BufferedReader inputStream = new BufferedReader(new 	InputStreamReader(System.in));
	
	// makes sure when they don't enter an expected value the system doesn't crash
		public static int getInteger() {
		try {
			return(Integer.valueOf(inputStream.readLine().trim()).intValue());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
		public static String getString() {
			try {
				return inputStream.readLine();
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		}
		
		
	//burger
		
	String burgerOrder;
	
	//what they can buy
	String burgerType[] = {"$4.99 Burger", "$5.99 CheeseBurger", "$5.99 Double Patty"};
	String toppings[] = { "Tomato", "Letuce", "Pickles", "Mustrad", "Ketchup", "Mayo", "Bacon"};
	
	public String burgerOrder(){
		// show all options
		System.out.println("What type of Burger would you like");
		for(int i = 0; i < burgerType.length; i++) {
			System.out.print((i+1) + ":" + burgerType[i] + ", ");
		}
		int burgerTypeNumber = getInteger();
		
		// check if they choose an option
		if(burgerTypeNumber < (burgerType.length + 1) && burgerTypeNumber > 0) {
			
			// assign option to string that will be returned
			burgerOrder = burgerType[burgerTypeNumber-1] + " ";
			
			// go through all the toppings and ask if they want or don't want
			for(int i = 0; i < toppings.length; i++) {
				
				System.out.println("Would you like \n" + toppings[i] + ": y/n");
				String doTheyWantToppings = getString();			

				// if they want the topping add it to the return string
				if(doTheyWantToppings.equals("y")) {
					
					burgerOrder += ( toppings[i] + ", " );
				}

			}
			return burgerOrder;
		}
		else {
			System.out.println("Not an option");
			return null;
		}
		
	}
	
	
	//sides
	
	String sides =" ";
	String Foodsize = " ";
	
	// sides options
	String[] sidesList = {"Fries", "Chicken nuggets", "Poutine",};
	String[] sizeList = {"Small $1.99", "Medium $2.99", "Large $3.99"};
	
	public String askSides() {
		
		System.out.println("What side would you like: ");
		
		//display all sides with numbers linked to it
		for(int i = 0; i<sidesList.length; i++) {
			System.out.print((i+1) + ":" + sidesList[i]+ ", ");
		}
		int sidenum = getInteger();
		
		// if they choose a side on the menu
		if(sidenum <= sidesList.length && sidenum >0){
			
			// add to string that will be returned
			sides = sidesList[sidenum - 1];
			
			//display all size options
				for(int i = 0; i < sizeList.length; i++) {
					System.out.print((i+1) + ":" + sizeList[i]+ ", ");
				}
					 int sizeNum = getInteger();
				 
					 // if size is an options add to return
				 if (sizeNum <= sizeList.length && sizeNum >0){
					 Foodsize = sizeList[sizeNum - 1];
					}
					else {
						System.out.println("Not an option");
						return " ";
					}	
		}
		else {
			System.out.println("Not an option");
			return null;
		}	
		
		// final return value
		if(sides != " " && Foodsize != " ") {
			String sideOrder = sides + " " + Foodsize;
			return sideOrder;
		}
		else {
			return" ";
		
	}
	}
	
	
	//drinks 
	
	String Drinksize;
	String drink = " ";
	String drinkOrder;
	
	//drink and size list
	String[] drinkList = {"Coke", "Diet Coke", "Spirte", "Icetea", "Fruitopia", "Rootbeer", "Coffee", "Other"};
	String[] drinkSize = {"1:Small $0.99", "2:Medium $1.79", "3:Large $1.99", "4:Extra Large $2.19"};

	public String askDrink() {
		System.out.println("What drink would you like: ");

		// out all drinks
		for(int i = 0; i<drinkList.length; i++) {
			System.out.print((i+1) + ": " + drinkList[i] + ", ");
		}
		
		int drinknum = getInteger();
		
		// if they choose an option
		if (drinknum <= drinkList.length && drinknum > 0){
			
			// if they choose other get them to enter their drink
			if(drinknum == drinkList.length) {
				System.out.println("Name the drink: ");
				drink = getString();
			}
			else {
				// add drink to what will be returned
				drink = drinkList[drinknum - 1];
			}
			
			// list of all sizes
			for(int i = 0; i < drinkSize.length ; i++) {
				System.out.print(drinkSize[i]+ ", ");
			}
			 int drinkSizenum = getInteger();

			 // if they choose a size add to return string
			 if (drinkSizenum <= drinkSize.length && drinkSizenum >0){
				 Drinksize = drinkSize[drinkSizenum - 1];
				} else {
					System.out.println("Not an option");
					return null;
				}	

		}
		else {
			System.out.println("Not an option");
			return null;
		}				
	
					
	// create the return
	if(Drinksize != " " && drink != " ") {
		drinkOrder = drink + " " + Drinksize.substring(2,Drinksize.length());
		return drinkOrder;
	}
	else {
		return null;
	}
}
}
