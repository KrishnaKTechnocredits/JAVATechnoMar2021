package aashay.ConditionalStatement;
/*
 * Create a Banking System which has the following functionality.

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

public class BankingSystem {
	int creditCnt=0; 
	int debitCnt =0;
	int printBalCnt = 0;
	double balance = 10000.00;
	static int staticCreditCount, staticDebitCount, staticPrintBalCnt;
	
	
	void debitAmount(double damnt) {
		if(balance >= damnt && damnt >0) {
			balance = balance - damnt;
			debitCnt++;
			staticDebitCount++;
		}else {
			System.out.println("You do not have sufficient balance in your account");
		}
	}
	void creditAmount(double camnt) {
		if(camnt>0) {
			balance = balance + camnt;
			creditCnt++;
			staticCreditCount++;
		}else {
			System.out.println(camnt+" Is not a valid amount.Please enter valid ammount");
		}
	}
	void printBalance(String user) {
		System.out.println("Current Balance of "+user+" is: "+balance);
		printBalCnt++;
		staticPrintBalCnt++;
	}
	void individualTransactionSummary(String user) {
		System.out.println(user+" transaction summary : Credit -:"+ creditCnt+" time, Debit - "+ debitCnt+" time, printBalance - "+ printBalCnt+" time");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+ staticCreditCount +" times, Debit - "+staticDebitCount+" times, printBalance - "+staticPrintBalCnt+" time");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem bankingsystemUser1 = new BankingSystem();
		BankingSystem bankingsystemUser2 = new BankingSystem();
		
		bankingsystemUser1.debitAmount(1000.00);
		bankingsystemUser1.creditAmount(5000.00);
		bankingsystemUser1.creditAmount(5000.00);
		bankingsystemUser1.printBalance("user1");
		bankingsystemUser1.individualTransactionSummary("user1");
		
		bankingsystemUser2.debitAmount(1000.00);
		bankingsystemUser2.debitAmount(1000.00);
		bankingsystemUser2.creditAmount(1000.00);
		bankingsystemUser2.creditAmount(1000.00);
		bankingsystemUser2.creditAmount(1000.00);
		bankingsystemUser2.creditAmount(1000.00);
		bankingsystemUser2.creditAmount(1000.00);
		bankingsystemUser2.individualTransactionSummary("user2");
		
		bankingsystemUser1.allTransactionSummary();
		
		bankingsystemUser1.debitAmount(10000000.00);
		bankingsystemUser1.debitAmount(-1000.00);
		bankingsystemUser1.printBalance("user1");
		bankingsystemUser1.creditAmount(0.00);
		bankingsystemUser1.creditAmount(-10.00);
		bankingsystemUser1.printBalance("user1");
	}

}
