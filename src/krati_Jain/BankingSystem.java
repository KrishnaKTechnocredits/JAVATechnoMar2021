/*Assignment 9* : *2nd April 2021*

*Create a Banking System which has the following functionality.*

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
*Output* :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
*Output* :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/


package krati_Jain;


public class BankingSystem {
	
	String customerName;
	double accountBalance;
	static int overallCredits;
	static int overallDebits;
	static int totalPrintBalance;
	int printBalance;
	int totalDebits;
	int totalCredits;
	
	void customerDetails(String custName, double actBalanace) {
		customerName = custName;
		accountBalance = actBalanace;
	}
	
	void debitAmount(double debitAmt) {
		while(accountBalance >= debitAmt) {
			accountBalance = accountBalance - debitAmt;
			overallDebits++;
			totalDebits++;
		}
			
	}
	
	void creditAmount(double creditAmt) {
		accountBalance = accountBalance + creditAmt;
		overallCredits++;
		totalCredits++;
	}
	
	void printBalance() {
		System.out.println("Current balance in " + customerName + "'s account is "+ accountBalance);
		printBalance++;
		totalPrintBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary : Credit - " + totalCredits + " times, Debit - " + totalDebits + " times, printBalance - " + printBalance + " time\n");
	}
	
	void allTransactionSummary() {
		System.out.println("\nAll transaction summary : Credit - " +  overallCredits + " times, Debit - " + overallDebits + " times, printBalance - " + totalPrintBalance + " time");
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		BankingSystem bankingSystem3 = new BankingSystem();
		
		bankingSystem1.customerDetails("User1", 10000);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.creditAmount(1200);
		bankingSystem1.debitAmount(1000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();

		bankingSystem2.customerDetails("User2", 35000);
		bankingSystem2.creditAmount(1500);
		bankingSystem2.debitAmount(3200);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
				
		bankingSystem3.customerDetails("User3", 1000);
		bankingSystem3.creditAmount(1200);
		bankingSystem3.creditAmount(820);
		bankingSystem3.debitAmount(300);
		bankingSystem3.printBalance();
		bankingSystem3.individualTransactionSummary();
		bankingSystem3.allTransactionSummary();
		
	}

}
