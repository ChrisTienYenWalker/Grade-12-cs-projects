package banking;
/**
 * CheckNumber.java
 * Name: Chris Walker
 * Date: February 22, 2022
 *
 *     Purpose: To understand how classes and overloading works. The goal is to create new accounts 
 *     and run them through different situations. These situations include creating new accounts,
 *     changing their name and balance, adding and withdrawing money and looking at their information.
 * 
 * Methods:
 *     toString – returns first name, last name and balance
 *     getName - returns first and last name
 *     getBalance - returns balance
 *     setFirstName - sets first name
 *     setLastName - sets last name 
 *     debit - returns new account balance after amount is withdrawn(if debit is not more then balance)
 *     credt- returns new balance with added money
 */
public class Account {
	private float balance;
	private String firstName, lastName;
	
	// constructor 
	public Account() {
		this("unkown", "unknown", 0);
	}
	
	
	// overload constructor 
	public Account(String account_lastName, String account_firstName, float account_balance) {
		
		// balance must be more then 0
		// they can't take out money they don't have
		if(account_balance < 0) {
			account_balance = 0;
		}
			balance = account_balance;
			firstName = account_firstName;
			lastName = account_lastName;
	}
	
	
	public float credit(double amount_added) {
		
		//imports double returns float of balance plus amount added
		return balance = (float) (balance + amount_added);
	}
	
	public float debit(double amount_withdrawn) {
		
		//checks if they can withdraw money since you can't withdraw what you don't have
		if(amount_withdrawn > balance) {
			System.out.println("Can't withdraw more then you own");
			return balance;
		}
		 return balance = (float) (balance - amount_withdrawn);
		
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName + " : " + balance;
	}
}
