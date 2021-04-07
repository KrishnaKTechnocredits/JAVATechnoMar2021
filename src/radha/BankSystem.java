/* Assignment9 -Create a Banking System which has the following functionality.
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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time */

package radha;

public class BankSystem {
	String userName;
	int totalBalance;
	int debitCount = 0;
	int creditCount = 0;
	int printBalCount = 0;
	static int totalDebitCnt=0;
	static int totalCreditCnt=0;
	static int totalPrintCnt=0;
	
	void setDetails(String name, int balance) {
		userName = name;
		totalBalance = balance;
	}
	
	void debitAmount(int debitAmount) {
		if(debitAmount<= totalBalance) {
			totalBalance = totalBalance - debitAmount;
			debitCount++;
			totalDebitCnt++;
		}
		else
			System.out.println("Total balance is 0. Cannot debit any amount");
	}
	
	void creditAmount(int credAmount) {
		if(credAmount > 0) {
			totalBalance = totalBalance + credAmount;
			creditCount++;
			totalCreditCnt++;
		}
	}
	
	void printBalance() {
		System.out.println("Total balance is "+totalBalance);
		printBalCount++;
		totalPrintCnt++;
	}
	
	void individualTransactionSummary() {
		System.out.println(userName+" transaction summary: Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printBalCount);
	}
	
	void allTransactionSummary() {
		System.out.println("All Transaction summary: Credit - "+totalCreditCnt+" times, Debit - "+totalDebitCnt+" times, printBalance - "+totalPrintCnt);
	}
	
	public static void main(String[] args) {
		BankSystem bank1 = new BankSystem();
		bank1.setDetails("User1", 15000);
		bank1.debitAmount(2700);
		bank1.debitAmount(6500);
		bank1.creditAmount(1000);
		bank1.debitAmount(3400);
		bank1.creditAmount(100);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		System.out.println();
		
		BankSystem bank2 = new BankSystem();
		bank2.setDetails("User2", 6000);
		bank2.debitAmount(3000);
		bank2.creditAmount(1000);
		bank2.printBalance();
		bank2.debitAmount(5000);
		bank2.printBalance();
		bank2.individualTransactionSummary();
		System.out.println();
		bank2.allTransactionSummary();
		
		
		
	}
}
