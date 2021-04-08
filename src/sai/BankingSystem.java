package sai;

/*
 * Assignment 9 : 2nd April 2021

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


public class BankingSystem{
	
	int totalBalance = 100000 , debitCount = 0, creditCount = 0, printCount = 0;
	static int allDebitCount = 0, allCreditCount = 0, allPrintCount = 0;
	String custnum;
	
	void debitAmount(int debAmount){
		if(debAmount<=totalBalance){
			totalBalance = totalBalance - debAmount;
			debitCount++;
			allDebitCount++;
		}
		else{
			System.out.println("Not enough balance to withdraw ");
		}
	}
	
	void creditAmount(int credAmount){
		totalBalance = totalBalance + credAmount;
		creditCount++;
		allCreditCount++;
	}
	
	void printBalance(){
		System.out.println("Balance left is " + totalBalance);
		printCount++;
		allPrintCount++;
	}
	
	void customerName(String name){
		custnum = name;
	}
	
	void individualTransactionSummary(){
		System.out.println(custnum + " Transaction summary is Debit -  " + debitCount + " times," + " Credit - " + creditCount + " times," + " Print balance -  " + printCount + " times.");
	}
	
	void allTransactionSummary(){
		System.out.println("Total transaction summary is Debit -  " + allDebitCount + " times," + " Credit - " + allCreditCount + " times," + " Print balance -  " + allPrintCount + " times.");
	}
	
	public static void main(String[] args){
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.customerName("User 1");
		bankingSystem1.debitAmount(1000);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.debitAmount(3000);
		bankingSystem1.creditAmount(4000);
		bankingSystem1.creditAmount(5000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.customerName("User 2");
		bankingSystem2.debitAmount(1000);
		bankingSystem2.debitAmount(2000);
		bankingSystem2.debitAmount(3000);
		bankingSystem2.debitAmount(4000);
		bankingSystem2.creditAmount(5000);
		bankingSystem2.creditAmount(1500);
		bankingSystem2.creditAmount(2500);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();
	}
}