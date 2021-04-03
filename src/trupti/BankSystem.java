package trupti;
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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

public class BankSystem {
	 int debitCnt=0;
	 int creditCnt=0;
	 int balance=10000,balanceCnt=0;
	 static int totalDebitCount=0;
	 static int totalCreditCount=0;
	 static int totalBalanceCount=0;
	
	 void debitAmt(int debitAmount) {
				
		 balance=balance-debitAmount;
		 //System.out.println(debitAmount + " Rs.is debited from your account");
		 debitCnt++;
		 totalDebitCount++;
	 }
	 
	 void creditAmt(int creditAmount) {
		 balance=balance+creditAmount;
		 //System.out.println(creditAmount + " Rs.is credited to your account");
		 creditCnt++;
		 totalCreditCount++;
	 }
	 
	void printBalance() {
		 System.out.println("Total Balance is :"+ balance);
		 balanceCnt++;
		 totalBalanceCount++;
	 }
	 
	 void individualTransactionSummary(String userName, int debitCount, int creditCount, int balanceCount ) {
		 System.out.println(userName +" transaction summary : "+"Debit - "+debitCount+ " times,"+" Credit - "+creditCount+" times,"+" Printbalance - "+balanceCount+ " times");
	 }
	 
	 void allTransactionSummary() {
		 System.out.println("All Transaction summary : "+"Debit - "+totalDebitCount+ " times,"+" Credit - "+totalCreditCount+" times,"+" Printbalance - "+totalBalanceCount+ " times");	 }
	 
	 public static void main(String[] args) {
		
		BankSystem banksystem=new BankSystem();
		System.out.println("User1 initial balance : "+banksystem.balance+" Rs.");
		banksystem.debitAmt(2500);
		banksystem.creditAmt(5000);
		banksystem.creditAmt(3000);
		banksystem.printBalance();
		banksystem.individualTransactionSummary("User1", banksystem.debitCnt, banksystem.creditCnt, banksystem.balanceCnt);
		
		
		BankSystem banksystem1=new BankSystem();
		System.out.println("\nUser2 initial balance : "+banksystem1.balance+" Rs.");
		banksystem1.debitAmt(3000);
		banksystem1.debitAmt(2500);
		banksystem1.creditAmt(100);
		banksystem1.creditAmt(2000);
		banksystem1.creditAmt(300);
		banksystem1.creditAmt(100);
		banksystem1.creditAmt(500);
		banksystem1.individualTransactionSummary("User2", banksystem1.debitCnt, banksystem1.creditCnt, banksystem1.balanceCnt);
		banksystem1.allTransactionSummary();
	}
}
