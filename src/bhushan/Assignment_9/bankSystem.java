/*Assignment 9* :

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

package bhushan.Assignment_9;

public class bankSystem {
	String custName;
	double accountBalance;
	static int totalAllCreditTrans;
	static int totalAllDebitTrans;
	static int totalAllPrintBalanceReceipts;
	int printBalanceReceipt;
	int totalDebitTrans;
	int totalCreditsTrans;

	void custDetails(String customerName, double accBalanace) {
		custName = customerName;
		accountBalance = accBalanace;
	}

	void debitAmount(double debitAmt) {
		if (accountBalance >= debitAmt) {
			accountBalance = accountBalance - debitAmt;
			totalAllDebitTrans++;
			totalDebitTrans++;
		}

	}

	void creditAmount(double creditAmt) {
		accountBalance = accountBalance + creditAmt;
		totalAllCreditTrans++;
		totalCreditsTrans++;
	}

	void printBalance() {
		System.out.println("Current balance of " + custName + " is " + accountBalance);
		printBalanceReceipt++;
		totalAllPrintBalanceReceipts++;
	}

	void individualTransactionSummary() {
		System.out.println(custName + " All transaction summary : Credit - " + totalCreditsTrans + " times, Debit - "
				+ totalDebitTrans + " times, Print Balance Recepits - " + printBalanceReceipt + " time\n");
	}

	void allTransactionSummary() {
		System.out.println("\nAll transaction summary : Total Credits Transactions - " + totalAllCreditTrans
				+ " times, Total All Debit Transactions - " + totalAllDebitTrans
				+ " times, Total All Print Balance Receipts - " + totalAllPrintBalanceReceipts + " time");
	}

	public static void main(String[] args) {
		bankSystem bankSystem1 = new bankSystem();
		bankSystem bankSystem2 = new bankSystem();
		bankSystem bankSystem3 = new bankSystem();

		bankSystem1.custDetails("Bhushan", 10000);
		bankSystem1.printBalance();
		bankSystem1.creditAmount(4000);
		bankSystem1.printBalance();
		bankSystem1.debitAmount(12000);
		bankSystem1.printBalance();
		bankSystem1.creditAmount(200);
		bankSystem1.printBalance();
		bankSystem1.debitAmount(1000);
		bankSystem1.printBalance();
		bankSystem1.creditAmount(600);
		bankSystem1.printBalance();
		bankSystem1.individualTransactionSummary();

		bankSystem2.custDetails("Suresh", 50000);
		bankSystem2.creditAmount(500);
		bankSystem2.debitAmount(2500);
		bankSystem2.printBalance();
		bankSystem2.individualTransactionSummary();

		bankSystem3.custDetails("Ramesh", 8000);
		bankSystem3.creditAmount(2000);
		bankSystem3.debitAmount(100);
		bankSystem3.printBalance();
		bankSystem3.debitAmount(500);
		bankSystem3.printBalance();
		bankSystem3.individualTransactionSummary();
		bankSystem3.allTransactionSummary();
	}
}
