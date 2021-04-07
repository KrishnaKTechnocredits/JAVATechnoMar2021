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

package shilpa.Assignment_9;

public class BankingSystem {
	int totalbal;
	int debitAmt;
	int creditAmt;
	String name;
	int debitAttempt=0;
	int creditAttempt=0;
	int printAttempt=0;
	static int totalDebitAttempt;
	static int totalCreditAttempt;
	static int totalPrintAttempt;

// ***********************Method to Credit amount*************************************	

	void Credit(String custname,int amount) {
		creditAmt = amount;
		name = custname;

		if(creditAmt>0)
		{
			totalbal=totalbal+creditAmt;
			creditAttempt++;
			totalCreditAttempt++;
		}else 
		{
			System.out.println("credit amount cannot be 0 , please enter valid amount");
		}
	}
// ***********************Method to Debit amount*************************************
	void Debit(String custname,int amount) {
		debitAmt = amount;
		name = custname;
		if(debitAmt==0)
		{
			System.out.println("Debit amount cannot be 0, please enter valid Amount");
		}else if(debitAmt>totalbal)
		{
			System.out.println("insufficient balance, Available balance is "+totalbal);
		}else
		{
		totalbal = totalbal - debitAmt;
		debitAttempt++;
		totalDebitAttempt++;
		}

	}
// ***********************Method to Print Balance*************************************
	void PrintBal() {
		System.out.println("Current Balance is:- "+totalbal);
		printAttempt++;
		totalPrintAttempt++;
	}

// ***********************Method to Print Individual Transaction Summary***************
	void individualTransactionSummary()
	{
		System.out.println(name+" Transaction Summery:- "+"Credit "+creditAttempt+ " times," +"Debit "+debitAttempt+ " times,"+" Printbalance "+printAttempt+" times.");
	}

// ***********************Method to print overall transaction Summary******************
	void allTransactionSummary(){
		System.out.println("All transaction Summery:- Credit "+totalCreditAttempt+ " times,"+" Debit - " +totalDebitAttempt+" times, "+"printBalance - " +totalPrintAttempt+" time");

	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem1.Credit("Customer1", 2000);
		bankingSystem1.Debit("Customer1",500);
		bankingSystem1.Credit("Customer1", 500);
		bankingSystem1.Debit("Customer1",200);
		bankingSystem1.PrintBal();
		bankingSystem1.individualTransactionSummary();


		bankingSystem2.Credit("Customer2", 1000);
		bankingSystem2.Debit("Customer2", 500);
		bankingSystem2.Debit("Customer2", 100);
		bankingSystem2.PrintBal();
		bankingSystem2.individualTransactionSummary();

		bankingSystem2.allTransactionSummary();
	}

}