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
	
	void debit (int dbAmount){
		if (dbAmount> totalBalance) {
			System.out.println("Insufficient funds");
		}else {
			totalBalance= totalBalance- dbAmount;
			debitCount++;
			totalNoOfDebits++;
		} 
	}
	
	void credit (int crAmount){
			totalBalance= totalBalance+crAmount;
			creditCount++;
			totalNoOfCredits++;
	}
	
	void printBalance (){
		System.out.println("Current balance for " + username + " is " + totalBalance);
		printBalance++;
		totalNoOfTimesPrintBalance++;
	}
	
	void individualTransactionSummary () {
		System.out.println(username + " transaction summary : Credit - " + creditCount + " times, Debit - " + debitCount + " times, printBalance - " + printBalance + " time");
	}
	
	void allTransactionSummary() {
		System.out.println("**************************All Transactions Count***************"
				+ "***********");
		System.out.println("All transaction summary : Credit - " + totalNoOfCredits + " times, Debit - " + totalNoOfDebits + " times, printBalance - " + totalNoOfTimesPrintBalance + " time");
	}
	
	public static void main (String[] args) {
		BankDebitCredit bankDebitCredit1= new BankDebitCredit();
		bankDebitCredit1.customerInfo("Rahul", 6000);
		bankDebitCredit1.debit(2000);
		bankDebitCredit1.credit(4000);
		bankDebitCredit1.credit(4000);
		bankDebitCredit1.debit(4000);
		bankDebitCredit1.debit(4000);
		bankDebitCredit1.printBalance();
		bankDebitCredit1.individualTransactionSummary();
		
		BankDebitCredit bankDebitCredit2= new BankDebitCredit();
		bankDebitCredit2.customerInfo("Rohit", 2000);
		bankDebitCredit2.debit(2000);
		bankDebitCredit2.credit(8000);
		bankDebitCredit2.credit(2000);
		bankDebitCredit2.debit(5000);
		bankDebitCredit2.credit(5000);
		bankDebitCredit2.printBalance();
		bankDebitCredit2.individualTransactionSummary();
		
		
		BankDebitCredit bankDebitCredit3= new BankDebitCredit();
		bankDebitCredit3.customerInfo("Akshay", 1000);
		bankDebitCredit3.debit(500);
		bankDebitCredit3.credit(1000);
		bankDebitCredit3.credit(1000);
		bankDebitCredit3.debit(2000);
		bankDebitCredit3.credit(1000);
		bankDebitCredit3.printBalance();
		bankDebitCredit3.individualTransactionSummary();
		
		bankDebitCredit2.allTransactionSummary();
	}
}