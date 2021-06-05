package priyanka_Kamble.assignment_9;

/*Assignment 09: 
Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit 

& printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit 

& printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/
public class BankTransaction {
	double balance = 1000;
	String customerName; 
	int debitCountIndividual = 0, creditCountIndividual = 0, printCountIndividual = 0;
	static int debitCountAll = 0, creditCountAll = 0, printCountAll = 0;
	
	void debitAmount(double debitAmt) {
		balance -= debitAmt;
		debitCountIndividual++;
		debitCountAll++;
	}

	void creditAmount(double creditAmt) {
		balance += creditAmt;
		creditCountIndividual++;
		creditCountAll++;
	}

	void printBalance() {
		System.out.println(customerName +" Current balance is: " +balance);
		printCountIndividual++;
		printCountAll++;
	}
	
	void setName(String custName) {
		customerName = custName;
	}

	void individualTransactionSummary() {
		System.out.println(customerName +" transaction summary: \n"+"Credit: "+creditCountIndividual+" time(s) \nDebit: "+debitCountIndividual+" time(s) \nPrintBalance: "+printCountIndividual+" time(s)");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary: \n"+"Credit: "+creditCountAll+" time(s) \nDebit: "+debitCountAll+" time(s) \nPrintBalance: "+printCountAll+" time(s)" );
	}

	public static void main(String[] args) {
		BankTransaction bankTransaction1 = new BankTransaction();
		bankTransaction1.setName("Customer1");
		bankTransaction1.creditAmount(500);
		bankTransaction1.debitAmount(100);
		bankTransaction1.creditAmount(500);
		bankTransaction1.printBalance();		
		bankTransaction1.individualTransactionSummary();		
		System.out.println();
		
		BankTransaction bankTransaction2 = new BankTransaction();
		bankTransaction2.setName("Customer2");
		bankTransaction2.creditAmount(100);
		bankTransaction2.creditAmount(200);
		bankTransaction2.debitAmount(100);
		bankTransaction2.creditAmount(100);
		bankTransaction2.creditAmount(50);
		bankTransaction2.debitAmount(100);
		bankTransaction2.creditAmount(50);				
		bankTransaction2.individualTransactionSummary();
		System.out.println();
		bankTransaction2.allTransactionSummary();
	}
}
