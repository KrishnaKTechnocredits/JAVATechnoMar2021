package shivani.Assignment_9;

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

public class BankingSystem {

	int totalBal;
	int debitCount;
	int creditCount;
	static int totalCreditCount;
	static int totalDebitCount;
	int printbalCount;
	static int totalPrintBalanceCount;

	void debitAmount(int totalbalnce, int dAmount) {
		totalBal = totalbalnce;
		if (totalBal > dAmount) {
			totalBal = totalBal - dAmount;
			debitCount++;
			totalDebitCount++;
		}

	}

	void creditAmount(int cAmount) {
		totalBal = totalBal + cAmount;
		creditCount++;
		totalCreditCount++;
	}

	void printBalance() {

		System.out.println("Current Balance for:" + totalBal);
		printbalCount++;
		totalPrintBalanceCount++;

	}

	void individualTransSummary(String name) {

		System.out.println(name + " transaction summary : credit - " + creditCount + "  times" + "  debit - "
				+ debitCount + "times" + "print - " + printbalCount);

	}

	void allTransSummary() {

		System.out.println("Total Transaction summary : credit - " + totalCreditCount + " times" + " debit - "
				+ totalDebitCount + "times " + " print - " + totalPrintBalanceCount);

	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.debitAmount(10000, 1000);
		bankingSystem1.creditAmount(4000);
		bankingSystem1.creditAmount(4000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransSummary("user1");

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.debitAmount(10000, 1000);
		bankingSystem2.debitAmount(5000, 2000);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.individualTransSummary("user2");
		bankingSystem2.allTransSummary();

	}
}
