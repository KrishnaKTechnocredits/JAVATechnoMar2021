package ankit.assignment_09;

public class Bank {
	String custName;
	int balance;
	int indCreditCount = 0;
	int indDebitCount = 0;
	static int creditCount = 0;
	static int debitCount = 0;
	
	void setAccount(String cName, int initBalance) {
		custName = cName;
		balance = initBalance;
	}
	
	void debitAmount(int debit) {
		if(balance >= debit) {
		balance = balance-debit;
		indDebitCount++;
		debitCount++;
		}
		else{
			System.out.println("Insufficient Balance Cannot perform Debit");
			System.out.println("****BALANCE REMAINING****");
		}
	}
	void creditAmount(int credit) {
		balance = balance+credit;
		indCreditCount++;
		creditCount++;
	}
	void printBalance() {
		System.out.println(custName + " Account balance : " + balance );
		
	}
	void individualTransactionSummary() {
		System.out.println(custName+ " Transaction Summary: Credit - "+indCreditCount +" times, Debit - "+indDebitCount);
	}
	 void allTransactionSummary() {
		System.out.println("All customers Transaction Summary: Credit - "+creditCount +" times, Debit - "+debitCount);
	 }
	public static void main(String[] args) {
		Bank bank = new Bank();
		// Code for Account : 1
		bank.setAccount("Ankit",5000);
		System.out.println("*****OPENING BALANCE*****");
		bank.printBalance();
		System.out.println("*****BALANCE AFTER DEBIT*****");
		bank.debitAmount(300);
		bank.printBalance();
		System.out.println("*****BALANCE AFTER CREDIT*****");
		bank.creditAmount(700);
		bank.printBalance();
		System.out.println("*****TRANSACTION SUMMARY*****");
		bank.individualTransactionSummary();
		
		//Code for Account : 2
		Bank bank1 = new Bank();
		bank1.setAccount("Tia",7000);
		System.out.println("*****OPENING BALANCE*****");
		bank1.printBalance();
		System.out.println("*****BALANCE AFTER DEBIT*****");
		bank1.debitAmount(7001);
		bank1.printBalance();
		System.out.println("*****BALANCE AFTER CREDIT*****");
		bank1.creditAmount(5000);
		bank1.printBalance();
		System.out.println("*****TRANSACTION SUMMARY*****");
		bank1.individualTransactionSummary();
		
		System.out.println("-------------------------------------");
		System.out.println("****ALL Transaction details*****");
		bank1.allTransactionSummary();
	}

}

/*
 Assignment 9 : 2nd April 2021

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
