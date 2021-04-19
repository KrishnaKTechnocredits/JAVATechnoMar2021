/*Assignment 9 : 2nd April 2021

Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
 
 */
package purva;
public class Bank {

	String name;
	int totalAmount;
	int debitCount = 0;
	int creditCount = 0;
	int printBal = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int printBalance = 0;
	
	void setCustomerDetails(int initialBal,String customerName) {
		totalAmount = initialBal;
		name =customerName;
	}
	
	void debit(int amount) {
		if(amount<=totalAmount)
		 totalAmount = totalAmount - amount;
		debitCount++;
		totalDebitCount++;
	}
	
	void credit(int amount) {
		if(amount>0) 
		  totalAmount = totalAmount + amount;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance() {
		System.out.println("Current Balance is "+totalAmount);
		printBal++;
		printBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println(name+" transaction summary : "+" credit - "+creditCount+" times,  debit - "+debitCount+" times, printbalance - "+printBal+" time");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : "+"credit - "+totalCreditCount+ " times , debit - "+totalDebitCount+" times, printbalance- "+printBalance+" time");
	}
	
	public static void main(String[] a) {
		Bank bank = new Bank();
		bank.setCustomerDetails(20000,"Purva");
		bank.debit(2000);
		bank.printBalance();
		bank.credit(1000);
		bank.debit(500);
		bank.printBalance();
		bank.individualTransactionSummary();
		
		Bank bank1 = new Bank();
		bank1.setCustomerDetails(80000, "Punit");
		bank1.credit(5000);
		bank1.debit(50000);
		bank1.credit(1000);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		
		bank.allTransactionSummary();
		
	}
}

