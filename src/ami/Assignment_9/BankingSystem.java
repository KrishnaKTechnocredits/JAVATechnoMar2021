/* 
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

package ami.Assignment_9;

public class BankingSystem {
	int balance;
	int debitBln = 0;
	int creditBln = 0;
	int inddebitCount = 0;
	int indcreditCount = 0;
	int indPrintcount =0;
	static int debitCount = 0, creditCount = 0 , printcount =0;
	
	void initialBalance(int balance) {
		this.balance = balance;
	}

	void debitAmount(int debitBln) {
	this.debitBln= debitBln;
		if (balance >= debitBln ) {
		balance = balance - debitBln;
		inddebitCount++;
		debitCount++;
		} else {
			System.out.println("Insufficient Balance ");
		}
	}

	void creditAmount(int creditBln) {
		this.creditBln = creditBln;
		balance = balance + creditBln;
		indcreditCount++;
		creditCount++;
	}
	
	void printBalance() {
		System.out.println(" my current Balance: " + balance);
		printcount++;
		indPrintcount++;
	}

	void individualTransactionSummary() {
		System.out.println("transaction summary : Credit- " + indcreditCount + "times , Debit - " + inddebitCount + "times," + " printBalance -" + indPrintcount +  "time");
	}
	

	void allTransactionSummary() {
		System.out.println("All transaction summary  : Credit- " + creditCount + "times , Debit - " + debitCount + "times," + " printBalance -" + printcount +  "time");
	
	}
	public static void main(String[] a) {
		System.out.println("----------user 1--------------");
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.initialBalance(10000);
		bankingSystem.debitAmount(3000);
		bankingSystem.creditAmount(4000);
		bankingSystem.creditAmount(5000);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		System.out.println();
		System.out.println("----------user 2--------------");
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.initialBalance(7000);
		bankingSystem2.debitAmount(3000);
		bankingSystem2.creditAmount(4000);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
		System.out.println();
		System.out.println("-----Total Transaction---------");
		bankingSystem2.allTransactionSummary();
		bankingSystem2.printBalance();

	}
}
