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
 *     toString ? returns first name, last name and balance
 *     getName - returns first and last name
 *     getBalance - returns balance
 *     setFirstName - sets first name
 *     setLastName - sets last name 
 *     debit - returns new account balance after amount is withdrawn(if debit is not more then balance)
 *     credt- returns new balance with added money
 */

public class BankingUI {
	public static void main(String args[]) {

		Account client1 = new Account();
        Account client2 = new Account("Smith", "George", 300);
        Account client3 = new Account("Thomas", "Sally", -20); 
        Account client4 = new Account("Jefferson", "Trish", 0);

          System.out.println(client1);
          System.out.println(client2);
          System.out.println(client3);
          System.out.println(client4);

          client1.setFirstName("Fred");
          client1.setLastName("Booth");
          client1.credit(400);

          String client1Name = client1.getName();
          float client1Balance = client1.getBalance();

          client2.credit(20);
          client3.credit(200);
          client4.credit(40); 

          System.out.println(client1);
          System.out.println(client2);
          System.out.println(client3);
          System.out.println(client4);

          client1.debit(60);
          client2.debit(400);
          client3.debit(200);
          client4.debit(20);

          System.out.println(client1);
          System.out.println(client2);
          System.out.println(client3);
          System.out.println(client4);
          
          client1.credit(15);
          client2.credit(42);
          client3.credit(23.70);
          client4.credit(55);

          System.out.println(client1);
          System.out.println(client2);
          System.out.println(client3);
          System.out.println(client4);;
	}
}
