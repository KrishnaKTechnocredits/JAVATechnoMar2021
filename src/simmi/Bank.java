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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time */


package simmi;

public class Bank {
	
	String name;
	double totalAmount = 10000;
	int credit = 0, debit = 0, printBalance = 0;
	static int totalCredit = 0, totalDebit = 0, totalPrintBalance = 0;
	
	void setName(String setName) {
		name = setName;
	}
	
	void debitAmount(double amount) {
		totalAmount = totalAmount - amount;
		debit++;
		totalDebit++;
	}
	
	void creditAmount(double amount) {
		totalAmount = totalAmount + amount;
		credit++;
		totalCredit++;
	}
	
	void printBalance() {
		System.out.println(" Current balance of customer " + name + " is " + totalAmount);
		printBalance++;
		totalPrintBalance++;
	}
	
	
	void individualTransactionSummary() {
		System.out.println(name + " has been credited  " + credit + " times " +
	                       " and her account has been debited  " + debit + " time. Her print count is " 
				            + printBalance );
		System.out.println("");
	}
	
	void allTransactionSummary() {
		System.out.println(" Total times the credit done is " + totalCredit + " and the debit done is " 
				+ totalDebit + " with total print count balance is " + totalPrintBalance );
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setName(" Simmi ");
		bank.debitAmount(4000);
		bank.creditAmount(2000);
		bank.creditAmount(3000);
		bank.printBalance();
		bank.individualTransactionSummary();
		
		
		Bank bank1 = new Bank();
		bank1.setName(" Upasana ");
		bank1.debitAmount(2500);
		bank1.debitAmount(4500);
		bank1.creditAmount(3000);
		bank1.creditAmount(1000);
		bank1.creditAmount(7000);
		bank1.creditAmount(2000);
		bank1.creditAmount(500);
		bank1.individualTransactionSummary();
		
		bank1.allTransactionSummary();
	}
}

