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


package krati_Shukla;

public class BankDebitCredit {
	
	static int Amount;
	String custName;
	int creditCounter;
	int debitCounter;
	int printBalance;
	static int totalPrintBalance;
	static int totalCreditCounter;
	static int totalDebitCounter;
	
	void customerInfo(String n, int amt) {
		custName = n;
		Amount = amt;
	}

	void debit(int dAmount) {
		while (dAmount<=Amount) {
			Amount = Amount-dAmount;
			debitCounter++;
			totalDebitCounter++;
		}	
		
	}
	
	void credit (int cAmount) {
		Amount = cAmount+Amount;
		creditCounter++;
		totalCreditCounter++;
	}
	
	void individualBalance() {
		System.out.println(custName+" transaction Summary : Credit "+creditCounter+" times, Debit "+debitCounter+" times, printBalance "+printBalance);
		System.out.println("------------------------------");
	}
	
	void allTransaction() {
		//System.out.println("********************************************************");	
		System.out.println("All transactions summary: Credit "+totalCreditCounter+", Debit "+totalDebitCounter+", printBalance "+totalPrintBalance);
		
	}
	
	void Balance() {
		System.out.println("Current Balance is :"+Amount);
		
		printBalance++;
		totalPrintBalance++;
	}
	
	public static void main(String[] a) {
		BankDebitCredit bankDebitCredit = new BankDebitCredit();
		bankDebitCredit.customerInfo("Tony", 1200);
		bankDebitCredit.debit(500);
		bankDebitCredit.credit(1500);
		bankDebitCredit.Balance();
		bankDebitCredit.individualBalance();
		
		
		BankDebitCredit bankDebitCredit1 = new BankDebitCredit();
		bankDebitCredit1.customerInfo("Mia", 2000);
		bankDebitCredit1.debit(500);
		bankDebitCredit1.credit(2000);
		bankDebitCredit1.Balance();
		bankDebitCredit1.individualBalance();
		
		
		
		bankDebitCredit1.allTransaction();
		
	}
}
