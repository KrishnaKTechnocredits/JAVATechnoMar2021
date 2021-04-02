package anubhav;

import java.security.PublicKey;

/*Create a Banking System which has the following functionality.

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

public class BankDebitCredit {
	
	String username;
	int totalBalance;
	int debitCount;
	int creditCount;
	int printBalance;
	static int totalNoOfCredits;
	static int totalNoOfDebits;
	static int totalNoOfTimesPrintBalance;
	
	void customerInfo (String uname, int currentBalance){
		totalBalance= currentBalance;
		username= uname;
	}
	
	void debit (int amount){
		while (amount<=totalBalance)
			totalBalance= totalBalance- amount;
			debitCount= debitCount + 1;
			totalNoOfDebits++;
	}
	
	void credit (int amount){
		while (amount<=totalBalance)
			totalBalance= totalBalance-amount;
			creditCount= creditCount + 1;
			totalNoOfCredits++;
	}
	
	void balanceCount (){
		printBalance++;
		totalNoOfTimesPrintBalance++;
	}
	
	void individualTransactionSummary () {
		System.out.println(username + " transaction summary : Credit - " + creditCount + " times, Debit - " + debitCount + " times, printBalance - " + printBalance + " time");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + totalNoOfCredits + " times, Debit - " + totalNoOfDebits + " times, printBalance - " + totalNoOfTimesPrintBalance + " time");
	}
	
	public static void main (String[] args) {
		BankDebitCredit bankDebitCredit1= new BankDebitCredit();
		bankDebitCredit1.customerInfo("Rahul", 100000);
		bankDebitCredit1.debit(10000);
		bankDebitCredit1.credit(40000);
		bankDebitCredit1.credit(80000);
		bankDebitCredit1.debit(4000);
		bankDebitCredit1.debit(75000);
		bankDebitCredit1.balanceCount();
		bankDebitCredit1.individualTransactionSummary();
		
		BankDebitCredit bankDebitCredit2= new BankDebitCredit();
		bankDebitCredit2.customerInfo("Rohit", 200000);
		bankDebitCredit2.debit(20000);
		bankDebitCredit2.credit(80000);
		bankDebitCredit2.credit(20000);
		bankDebitCredit2.debit(5000);
		bankDebitCredit2.credit(55000);
		bankDebitCredit2.balanceCount();
		bankDebitCredit2.individualTransactionSummary();
		
		BankDebitCredit bankDebitCredit3= new BankDebitCredit();
		bankDebitCredit3.customerInfo("Akshay", 200000);
		bankDebitCredit3.debit(50000);
		bankDebitCredit3.credit(40000);
		bankDebitCredit3.credit(30000);
		bankDebitCredit3.debit(7000);
		bankDebitCredit3.credit(8000);
		bankDebitCredit3.balanceCount();
		bankDebitCredit3.individualTransactionSummary();
		
		bankDebitCredit2.allTransactionSummary();
	}
}