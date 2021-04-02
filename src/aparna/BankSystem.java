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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
 */

package aparna;

public class BankSystem {
	String customerName;
	int totalBalance;
	int debitCount = 0;
	static int totalDebitCount = 0;
	int creditCount = 0;
	static int totalCreditCount = 0;
	int printBalanceCount = 0;
	static int totalPrintBalanceCount = 0;

	void setCustomerDetails(String name, int initialAmount) {
		customerName = name;
		totalBalance = initialAmount;
	}

	void debitAmount(int debitAmount) {
		if (debitAmount > totalBalance) {
			System.out.println("You dont have sufficient balance in your Account");
		} else {
			totalBalance = totalBalance - debitAmount;
			debitCount++;
			totalDebitCount++;
		}
	}

	void creditAmount(int creditAmount) {
		totalBalance = totalBalance + creditAmount;
		creditCount++;
		totalCreditCount++;
	}

	void printBalance() {
		System.out.println("Current Balance in :- " + customerName + "'s Account is : " + totalBalance + "\n");
		printBalanceCount++;
		totalPrintBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary : " + "\n" + "credit : " + creditCount + " times ,"
				+ "Debit : " + debitCount + " times," + " printBalance : " + printBalanceCount + " times" + "\n");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary : " + "\n" + "Credit : " + totalCreditCount + " times," + "Debit : "
				+ totalDebitCount + " times," + " printBalance:  " + totalPrintBalanceCount + " times" + "\n");
	}

	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		bankSystem.setCustomerDetails("Customer1", 0);
		bankSystem.debitAmount(1000);
		bankSystem.creditAmount(3000);
		bankSystem.creditAmount(3000);
		bankSystem.debitAmount(1000);
		bankSystem.printBalance();
		bankSystem.individualTransactionSummary();

		BankSystem bankSystem1 = new BankSystem();
		bankSystem1.setCustomerDetails("Customer2", 20000);
		bankSystem1.creditAmount(4000);
		bankSystem1.creditAmount(1000);
		bankSystem1.debitAmount(1000);
		bankSystem1.creditAmount(7000);
		bankSystem1.creditAmount(2000);
		bankSystem1.debitAmount(3000);
		bankSystem1.printBalance();
		bankSystem1.creditAmount(6000);
		bankSystem1.debitAmount(5000);
		bankSystem1.debitAmount(5000);
		bankSystem1.printBalance();
		bankSystem1.individualTransactionSummary();

		bankSystem1.allTransactionSummary();
	}

}
